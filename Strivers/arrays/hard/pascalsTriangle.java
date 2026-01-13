import java.util.*;

class Solution{
    public List<Integer> row(int row){
        int ans = 1;
        List<Integer> pascalRow = new ArrayList<>();
        pascalRow.add(ans);
        for(int i = 1; i < row; i++){
            ans = ans * (row - i);
            ans = ans / i;
            pascalRow.add(ans);
        }
        return pascalRow;
    }
    public List<List<Integer>> fullTriangle(int n){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            triangle.add(row(i));
        }
        return triangle;
    }
}
public class pascalsTriangle{

    public static void main(String args[]){
        int n = 5;
        Solution sol = new Solution();
        List<List<Integer>> result = sol.fullTriangle(n);
        for(List<Integer> row : result){
            System.out.println(row);
        }

    }
}