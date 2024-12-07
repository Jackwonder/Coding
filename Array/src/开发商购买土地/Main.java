package 开发商购买土地;

import java.lang.management.MemoryType;
import java.util.Scanner;

/**
 * 题目链接：https://kamacoder.com/problempage.php?pid=1044
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][]arr = new int[n][m];
        int sum = 0;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                arr[i][j] = scanner.nextInt();
                sum += arr[i][j];
            }
        }

        int[] rowSum = new int[n];
        int[] colSum = new int[m];

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                rowSum[i] += arr[i][j];
            }
        }

        for (int j = 0 ; j < m ; j++){
            for (int i = 0 ; i < n ; i++){
                colSum[j] += arr[i][j];
            }
        }
        int result = Integer.MAX_VALUE;
        int row = 0;
        int col = 0;

        for (int i = 0 ; i < n ; i++){
            row += rowSum[i];
            result = Math.min(result , Math.abs(sum - row * 2));
        }

        for (int j = 0 ; j < m ; j++){
            col += colSum [j];
            result = Math.min(result , Math.abs(sum - col * 2));
        }
        System.out.println(result);
    }
}
