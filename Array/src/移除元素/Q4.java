package 移除元素;

/**
 * 题目链接：https://leetcode.cn/problems/backspace-string-compare/description/
 *
 * 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 *
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 * 示例 1：
 * 输入：s = "ab#c", t = "ad#c"
 * 输出：true
 * 解释：s 和 t 都会变成 "ac"。
 *
 * 示例 2：
 * 输入：s = "ab##", t = "c#d#"
 * 输出：true
 * 解释：s 和 t 都会变成 ""。
 *
 * 示例 3：
 * 输入：s = "a#c", t = "b"
 * 输出：false
 * 解释：s 会变成 "c"，但 t 仍然是 "b"。
 */

public class Q4 {
    public boolean backspaceCompare(String s, String t) {
        int skips = 0;
        int skipt = 0;
        int sPos = s.length()-1;
        int tPos = t.length()-1;
        while (sPos >= 0 || tPos >= 0) {
            while ( sPos >= 0) {
                if (s.charAt(sPos) == '#'){
                    skips++;
                    sPos--;
                }else if (skips > 0){
                    sPos--;
                    skips--;
                } else {
                    break;
                }
            }
            while ( tPos >= 0) {
                if (t.charAt(tPos) == '#'){
                    skipt++;
                    tPos--;
                }else if (skipt > 0){
                    tPos--;
                    skipt--;
                } else {
                    break;
                }
            }

            if (s.charAt(sPos) != t.charAt(tPos)){
                return false;
            }
            sPos--;
            tPos--;
        }
        return true;
    }
}
