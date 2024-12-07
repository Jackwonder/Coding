package 找出字符串中第一个匹配项的下标;

/**
 * 题目链接：https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 *给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。如果 needle 不是 haystack 的一部分，则返回  -1 。
 *
 * 示例 1：
 * 输入：haystack = "sadbutsad", needle = "sad"
 * 输出：0
 * 解释："sad" 在下标 0 和 6 处匹配。
 * 第一个匹配项的下标是 0 ，所以返回 0 。
 */
public class Q1 {
    public int strStr(String haystack, String needle) {
        int hayIndex = 0;
        int neeIndex = 0;
        while (hayIndex < haystack.length() && neeIndex < needle.length()){
            if (haystack.charAt(hayIndex) == needle.charAt(neeIndex)){
                hayIndex++;
                neeIndex++;
            } else {
                hayIndex -= neeIndex - 1;
                neeIndex = 0;
            }
        }
        if (neeIndex == needle.length()){
            return hayIndex - neeIndex;
        }else {
            return -1;
        }
    }
}
