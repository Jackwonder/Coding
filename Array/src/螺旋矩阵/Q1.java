package 螺旋矩阵;

/**
 * 题目链接：https://leetcode.cn/problems/spiral-matrix-ii/description/
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * 示例 1：
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
 *
 * 示例 2：
 * 输入：n = 1
 * 输出：[[1]]
 */
public class Q1 {
    public int[][] generateMatrix(int n) {
        int startX = 0, startY = 0;
        int offSet = 1;
        int[][] arr = new int[n][n];
        int count = 1;
        int i, j;
        int loop = 1;

        while (loop <= n / 2){

            for (j = startY ; j < n - offSet ; j++) {
                 arr[startX][j] = count++;
            }
            for (i = startX ; i < n - offSet ; i++) {
                arr[i][j] = count++;
            }
            for ( ; j > startY ; j-- ) {
                arr[i][j] = count++;
            }
            for ( ; i > startX ; i--) {
                arr[i][j] = count++;
            }
            offSet++;
            startX++;
            startY++;
            loop++;
        }
        if (n % 2 == 1) {
            arr[startX][startY] = count;
        }
        return arr;
    }
}
