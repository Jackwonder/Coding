package 重复的子字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目链接：https://leetcode.cn/problems/repeated-substring-pattern/description/
 * <p>
 * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
 * <p>
 * 示例 1:
 * 输入: s = "abab"
 * dd输出: true
 * 解释: 可由子串 "ab" 重复两次构成。
 */
public class Q1 {
    public boolean repeatedSubstringPattern(String s) {
        /*
        // 方法一：移动匹配
        String newS = s + s;
        String res = newS.substring(1, newS.length() - 1);
        if (res.contains(s)) {
            return true;
        } else {
            return false;
        }
        */

        // 方法二：KMP
        int[] next = findNext(s);
        int len = next[s.length() - 1];
        if (len > 0 && s.length()%(s.length()-len) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] findNext(String s) {
        int[] next = new int[s.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}

