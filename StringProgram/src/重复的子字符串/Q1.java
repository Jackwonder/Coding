package 重复的子字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目链接：https://leetcode.cn/problems/repeated-substring-pattern/description/
 *
 * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
 *
 * 示例 1:
 * 输入: s = "abab"
 * 输出: true
 * 解释: 可由子串 "ab" 重复两次构成。
 */
public class Q1 {
    public boolean repeatedSubstringPattern(String s) {
        List<Character> list = new ArrayList<>();
        int i = 0;
        while (i < s.length()){
            if (s.charAt(i) == list.get(0)){

            }
        }
    }
}

