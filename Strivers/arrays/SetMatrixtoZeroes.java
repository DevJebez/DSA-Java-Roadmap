import java.util.*;
public class SetMatrixtoZeroes{
    //optimal 
    public void setZeroes(int[][] matrix) {
        boolean firstrow = false, firstcol = false;
        int m = matrix.length, n = matrix[0].length;
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstrow = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstcol = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (firstrow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        if (firstcol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String args[]){
        int[][] matrix = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        int n = matrix.length; // rows
        int m = matrix[0].length; // cols
        ArrayList<Integer> cols = new ArrayList<>();
        ArrayList<Integer> rows = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j<m ; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int row:rows){
            for(int i = 0; i < m ; i++){
                matrix[row][i] = 0;
            }
        }
        for(int col : cols){
            for(int j = 0; j<n ;j++){
                matrix[j][col] = 0;
            }
        }
        //printing matrix
        for(int i = 0 ; i< n ; i++){
            for(int j = 0; j<m ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }


}