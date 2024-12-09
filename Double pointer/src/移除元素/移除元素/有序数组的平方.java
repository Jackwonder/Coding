package 移除元素.移除元素;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 */
public class 有序数组的平方 {
    public int[] sortedSquares(int[] nums) {
        /*
        // 我自己写的：
        int i = 0;
        int[] newArr = new int[nums.length];
        for (; i < nums.length; i++) {
            if (nums[i] >= 0) {
                break;
            }
        }
        int left = i - 1;
        int right = i;
        int count = 0;
        while (true) {
            if (left >= 0 && right < nums.length && Math.abs(nums[left]) > Math.abs(nums[right])) {
                newArr[count] = nums[right] * nums[right];
                right++;
                count++;
            } else if (left >= 0 && right < nums.length && Math.abs(nums[left]) <= Math.abs(nums[right])) {
                newArr[count] = nums[left] * nums[left];
                left--;
                count++;
            }
            while (left < 0 && right < nums.length) {
                newArr[count] = nums[right] * nums[right];
                right++;
                count++;
            }
            while (right >= nums.length && left >= 0) {
                newArr[count] = nums[left] * nums[left];
                left--;
                count++;
            }
            if (left < 0 && right >= nums.length) {
                break;
            }
        }
        return newArr;*/

        // 优化后的：
        int left = 0;
        int right = nums.length - 1;
        int[] newArr = new int[nums.length];
        int index = nums.length - 1;
        while (left <= right){
            int leftPow = nums[left] * nums[left];
            int rightPow = nums[right] * nums[right];

            if (leftPow < rightPow){
                newArr[index] = rightPow;
                right--;
                index--;
            } else {
                newArr[index] = leftPow;
                left++;
                index--;
            }
        }
        return newArr;
    }
}
