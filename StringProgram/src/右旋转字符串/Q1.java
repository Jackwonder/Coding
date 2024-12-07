package 右旋转字符串;

import java.util.Scanner;

/**
 * 题目链接：https://kamacoder.com/problempage.php?pid=1065
 * 字符串的右旋转操作是把字符串尾部的若干个字符转移到字符串的前面。给定一个字符串 s 和一个正整数 k，请编写一个函数，将字符串中的后面 k 个字符移到字符串的前面，实现字符串的右旋转操作。
 * <p>
 * 例如，对于输入字符串 "abcdefg" 和整数 2，函数应该将其转换为 "fgabcde"。
 * <p>
 * 输入描述
 * 输入共包含两行，第一行为一个正整数 k，代表右旋转的位数。第二行为字符串 s，代表需要旋转的字符串。
 * 输出描述
 * 输出共一行，为进行了右旋转操作后的字符串。
 * 输入示例
 * 2
 * abcdefg
 */
public class Q1 {

    public static String rightReverse(int n, String str) {
        /*if (n > str.length() || str == null){
            return null;
        }*/
        String subString = str.substring(str.length() - n);
        String append = str.substring(0, str.length()  - n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(subString);
        stringBuilder.append(append);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        System.out.println(rightReverse(n, str));
    }
}
