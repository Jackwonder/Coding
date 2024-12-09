package 移除元素.移除元素;

/**
 * 链接：https://leetcode.cn/problems/remove-element/
 */
public class Q1 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int fast = 0;
        int slow = 0;
        for(; fast < nums.length; fast++){
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                count++;
                slow++;
            }
        }
        return count;
    }
}
