package 螺旋矩阵;

/**
 * 题目链接：https://leetcode.cn/problems/spiral-matrix/
 */

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        if (matrix == null || rowLen == 0 || colLen == 0){
            return  list;
        }
        int startX = 0;
        int startY = 0;
        int endX = rowLen - 1;
        int endY = colLen - 1;
        while ( startX <= endX && startY <= endY ){
            for ( int j = startY ; j <= endY ; j++ ){
                list.add(matrix[startX][j]);
            }
            startX++;

            for ( int i = startX ; i <= endX ; i++){
                list.add(matrix[i][endY]);
            }
            endY--;

            if ( startX <= endX ){
                for ( int j = endY ; j >= startY ; j--){
                    list.add(matrix[endX][j]);
                }
            }
            endX--;

            if ( startY <= endY ) {
                for ( int i = endX ; i >= startX ; i-- ){
                    list.add(matrix[i][startY]);
                }
            }
            startY++;
        }
        return list;
    }
}
