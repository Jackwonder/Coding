package 移除元素;

/**
 * 题目链接：https://leetcode.cn/problems/move-zeroes/
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 * 示例 1:
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 示例 2:
 * 输入: nums = [0]
 * 输出: [0]
 */
public class Q3 {
    public void moveZeroes(int[] nums) {
        if (nums.equals(null)) {
            return;
        }
        int count = 0;
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {

            if (nums[slow] == 0){
                count++;
            }
            while (nums[fast] == 0){
                fast++;
            }
            nums[slow] = nums[fast];
            slow++;
            fast++;
        }
        while (count > 0){
            nums[slow] = 0;
            slow++;
            count--;
        }
        System.out.println(nums);
    }
}
