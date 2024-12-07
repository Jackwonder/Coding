package 长度最小的子数组;

/**
 * 题目链接：https://leetcode.cn/problems/minimum-window-substring/
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 * 注意：
 * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
 *
 * 示例 1：
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * 解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
 *
 * 示例 2：
 * 输入：s = "a", t = "a"
 * 输出："a"
 * 解释：整个字符串 s 是最小覆盖子串。
 *
 * 示例 3:
 * 输入: s = "a", t = "aa"
 * 输出: ""
 * 解释: t 中两个字符 'a' 均应包含在 s 的子串中，
 * 因此没有符合条件的子字符串，返回空字符串。
 */

public class Q3 {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()){
            return  "";
        }

        int[] need = new int[128];
        int[] have = new int[128];

        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        int left = 0;
        int right = 0;
        int count = 0;
        int min = s.length() + 1;
        int start = 0;
        while( right < s.length()) {
            char r = s.charAt(right);
            if ( need[r] == 0 ) {
                right++;
                continue;
            }
            if (have[r] < need[r]) {
                count++;
            }
            right++;
            have[r]++;
            while (count == t.length()){
                while (min > right - left) {
                    min = right - left;
                    start = left;
                }
                char l = s.charAt(left);
                if (need[l] == 0) {
                    left++;
                    continue;
                }
                if (have[l] == need[l]) {
                    count--;
                }
                left++;
                have[l]--;
            }
        }
        if (min == s.length() + 1) {
            return "";
        }
        return s.substring(start, start + min);
    }
}
