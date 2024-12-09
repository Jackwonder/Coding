package 移除元素.移除元素;

/**
 * 删除有序数组中的重复项
 * 题目链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-array/description/
 *
 *
 */

public class Q2 {
    public int removeDuplicates(int[] nums) {
        int fast = 0;
        int slow = 0;
        for (; fast < nums.length; fast++){
            if (nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
