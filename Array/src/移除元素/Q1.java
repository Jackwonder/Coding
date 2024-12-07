package 移除元素;

/**
 * 链接：https://leetcode.cn/problems/remove-element/
 */
public class Q1 {
    public int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;
        int count = 0;
        for (; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
                count ++;
            }
        }
        return count;
    }
}
