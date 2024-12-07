package 替换数字;

import java.util.Scanner;

/**
 * 题目链接：https://kamacoder.com/problempage.php?pid=1064
 * 题目描述
 * 给定一个字符串 s，它包含小写字母和数字字符，请编写一个函数，将字符串中的字母字符保持不变，而将每个数字字符替换为number。
 * 例如，对于输入字符串 "a1b2c3"，函数应该将其转换为 "anumberbnumbercnumber"。
 * 输入描述
 * 输入一个字符串 s,s 仅包含小写字母和数字字符。
 *
 * 输入示例
 * a1b2c3
 * 输出示例
 * anumberbnumbercnumber
 */
public class Q1 {
    public static String ReplaceString(String str){
        StringBuffer res = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)){
                res.append("number");
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(ReplaceString(input));
    }
}
