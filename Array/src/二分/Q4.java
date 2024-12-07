package 二分;

public class Q4 {
    public boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;
        while (l <= r) {
            int mid = (l + r)/2;
            long t = (long)mid * mid;
            if (t < num) {
                l = mid + 1;
            } else if (t > num) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
