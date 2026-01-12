import java.util.List;
import java.util.ArrayList;
class spiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> spiralMatrix = new ArrayList<Integer>();
        int top = 0, left = 0;
        int bottom = m - 1, right = n - 1;
        while(top <= bottom && left<=right){ 
            for(int i = left; i <= right ; i++){
                spiralMatrix.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom ; i++){
                spiralMatrix.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){ 
                for(int i = right ; i>=left ; i--){
                    spiralMatrix.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left <= right){ 
                for(int i = bottom ; i>=top;i--){
                    spiralMatrix.add(matrix[i][left]);
                }
            }
            left++;
        }
        return spiralMatrix;
    }
    public static void main(String args[]){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> result= spiralOrder(matrix);
        for(int n : result){
            System.out.print(n + " ");
        }
    }
}