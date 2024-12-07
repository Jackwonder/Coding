package 反转字符串;

public class Q1 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right){
            char ltemp = s[left];
            char rtemp = s[right];
            s[left] = rtemp;
            s[right] = ltemp;
            left++;
            right--;
        }
    }
}
