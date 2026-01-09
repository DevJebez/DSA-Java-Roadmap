import java.util.*;
class Solution{
    public ArrayList<Integer> bruteForce(int[] arr){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i= 0; i<arr.length; i++){
            boolean leader = true;
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public ArrayList<Integer> optimal(int[] arr){
        ArrayList<Integer> leaders = new ArrayList<>();
        if (arr.length == 0) return leaders;
        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0 ; i--){
            if(arr[i] > max){
                max = arr[i];
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }
}
public class LeadersArray{
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] arr = {6, 5, 22, 1, 0};
        ArrayList<Integer> leaders = sol.bruteForce(arr);
        ArrayList<Integer> leaders1 = sol.optimal(arr);
        for(int num : leaders1){
            System.out.print(num+" ");
        }
    }
}