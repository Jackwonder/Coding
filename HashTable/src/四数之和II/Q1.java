package 四数之和II;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int i : nums3) {
            for (int j : nums4) {
                int sum = i + j;
                res += map.getOrDefault(-sum, 0);
            }
        }
        return res;
    }
}
