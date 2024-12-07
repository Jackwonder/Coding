package 二分;

/**
 * @题目链接：https://leetcode.cn/problems/search-insert-position/description/
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class Q1 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = ( left + right ) / 2;
            int midVal = nums[mid];
            if (target < midVal) {
                right = mid - 1;
            }
            if (target > midVal) {
                left = mid + 1;
            }
            if (target == midVal){
                return mid;
            }
        }
        return right + 1;
    }
}
