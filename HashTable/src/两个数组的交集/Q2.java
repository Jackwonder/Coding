package 两个数组的交集;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2 {
    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length < nums2.length) {
            //int[] arr = new int[nums1.length];
            List<Integer> list = new ArrayList<>();
            //int key = 0;
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums2[i] == nums1[j]){
                        list.add(nums1[j]);
                        //key++;
                        nums1[j] = 1001;
                    }
                }
            }
            int []arr = list.stream().mapToInt(Integer::intValue).toArray();
            return arr;
        } else {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        list.add(nums1[j]);

                        nums2[j] = 1001;
                    }
                }
            }
            int []arr = list.stream().mapToInt(Integer::intValue).toArray();
            return arr;
        }

    }
}
