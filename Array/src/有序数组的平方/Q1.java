package 有序数组的平方;

/**
 * 题目链接：
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

 * 示例 1：
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 *
 * 示例 2：
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 */

public class Q1 {
    // 方法一：
//    public int[] sortedSquares(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//    }

    // 方法二：
    public int[] sortedSquares(int[] nums) {
        int navigate = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                navigate++;
            } else {
                break;
            }
        }

        int[] arrs = new int [nums.length];
        int n = 0;
        int i = navigate;
        int j = navigate + 1;

        while (i >= 0 || j < nums.length){
            if ( i < 0) {
                arrs[n] = nums[j] * nums[j];
                j++;
            }  else if (j == nums.length) {
                arrs[n] = nums[i] * nums[i];
                i--;
            } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                arrs[n] = nums[i] * nums[i];
                i--;
            } else {
                arrs[n] = nums[j] * nums[j];
                j++;
            }
            n++;
        }
        return arrs;
    }
}
