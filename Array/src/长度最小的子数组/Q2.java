package 长度最小的子数组;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目链接：https://leetcode.cn/problems/fruit-into-baskets/description/
 * 示例 1：
 * 输入：fruits = [1,2,1]
 * 输出：3
 * 解释：可以采摘全部 3 棵树。
 *
 * 示例 2：
 * 输入：fruits = [0,1,2,2]
 * 输出：3
 * 解释：可以采摘 [1,2,2] 这三棵树。
 * 如果从第一棵树开始采摘，则只能采摘 [0,1] 这两棵树。
 *
 * 示例 3：
 * 输入：fruits = [1,2,3,2,2]
 * 输出：4
 * 解释：可以采摘 [2,3,2,2] 这四棵树。
 * 如果从第一棵树开始采摘，则只能采摘 [1,2] 这两棵树。
 *
 * 示例 4：
 * 输入：fruits = [3,3,3,1,2,1,1,2,3,3,4]
 * 输出：5
 * 解释：可以采摘 [1,2,1,1,2] 这五棵树。
 */
public class Q2 {
    public int totalFruit(int[] fruits) {
        int i = 0;
        int j = 0;
        int ans = 0;
        Map<Integer,Integer> cnt = new HashMap<>();
        for ( ; i < fruits.length; i++){
            int x = fruits[i];
            cnt.put(x, cnt.getOrDefault(x,0) + 1);
            while (cnt.size() > 2){
                int y = fruits[j++];
                cnt.put(y, cnt.get(y)-1);
                if (cnt.get(y) == 0){
                    cnt.remove(y);
                }
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}
