package 反转字符串中的单词;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目链接：https://leetcode.cn/problems/reverse-words-in-a-string/description/
 * <p>
 * 输入：s = "the sky is blue"
 * 输出："blue is sky the"
 */
public class Q1 {
    public String reverseWords(String s) {

        List<String> list = new ArrayList<>();

        int i = 0;
        s = s.trim();
        while (i < s.length()) {
            int count = 0;
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
                count++;
            }
            if (count > 0) {
                String substring = s.substring(i - count, i);
                list.add(substring);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = list.size() - 1; j >= 0; j--) {
            stringBuilder.append(list.get(j));
            if (j != 0){
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }
}
