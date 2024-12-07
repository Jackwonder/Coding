package 区间和;

import java.util.Scanner;

/**
 * 题目链接：https://kamacoder.com/problempage.php?pid=1070
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int [] p = new int[n];
        int fakeSum = 0;
        for (int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt();
            fakeSum += arr[i];
            p[i] = fakeSum;
        }

        while (scanner.hasNext()){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int sum = 0;
            if (start == 0){
                sum = p[end];
            } else {
                sum = p[end] - p[start-1];
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
