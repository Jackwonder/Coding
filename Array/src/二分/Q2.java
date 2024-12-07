package 二分;

/**
 * 链接：https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 *
 * 示例 1：
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 *
 * 示例 2：
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 *
 * 示例 3：
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 */
public class Q2 {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = searchFirstIndex(nums,target);
        int lastIndex = seratchLastIndex(nums,target);
        return new int[]{firstIndex,lastIndex};
    }

    private int seratchLastIndex(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if(target == nums[mid]){
                if (mid == nums.length-1 || nums[mid+1] != target){
                    return mid ;
                } else {
                    left = mid + 1;
                }
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int searchFirstIndex(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if(target == nums[mid]){
                if (mid == 0 || nums[mid-1] != target){
                } else {
                    right = mid - 1;
                }
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }




}
