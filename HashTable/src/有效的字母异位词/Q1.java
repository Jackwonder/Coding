package 有效的字母异位词;

/**
 * 题目链接：https://leetcode.cn/problems/valid-anagram/
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的
 * 字母异位词
 * 。

 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 */
public class Q1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        int[] character = new int[26];

        for (int i = 0; i < s.length(); i++) {
            character[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            character[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < character.length; i++) {
            if (character[i] != 0){
                return false;
            }
        }
        return true;
    }
}
