package 二分;

/**
 * 链接：https://leetcode.cn/problems/sqrtx/description/
 *
 */
public class Q3 {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int rus = -1;
        while (l <= r) {
            int mid = (l - r)/2;
            if (x >= (long)mid * mid) {
                l = mid + 1;
                rus = mid;
            } else {
                r = mid - 1;
                rus = mid;
            }
        }
        return rus;
    }
}
