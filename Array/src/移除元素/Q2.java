package 移除元素;

public class Q2 {
    public int removeDuplicates(int[] nums) {
        int num = nums.length;
        if (num == 0) {
            return 0;
        }
        int fast = 1;
        int slow = 1;
        while (fast < num) {
            if (nums[fast - 1 ] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
                fast++;
        }
        return slow;
    }
}
