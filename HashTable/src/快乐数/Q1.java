package 快乐数;

import java.util.HashSet;

public class Q1 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getRes(n);
        }
        return n == 1;
    }

    public int getRes(int n) {
        int res = 0;
        while (n > 0) {
            int g = n % 10;
            res += g * g;
            n = n / 10;
        }
        return res;
    }
}
