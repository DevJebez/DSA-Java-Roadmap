import java.util.*;
class Solution {
    public void bruteForce(int[] A) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int n = A.length;
        // Step 1: Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (A[i] > 0)
                pos.add(A[i]); // Add to positives
            else
                neg.add(A[i]); // Add to negatives
        }
        for (int i = 0; i < n / 2; i++) {
            A[2 * i] = pos.get(i);       // Even index → positive
            A[2 * i + 1] = neg.get(i);   // Odd index → negative
        }

        for(int num:A){
            System.out.print(num+ " ");
        }

    }
    public void optimal(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        int posIndex = 0, negIndex = 1;
        for(int num: arr){
            if(num > 0){
                res[posIndex] = num;
                posIndex += 2;
            }
            else{
                res[negIndex] = num;
                negIndex += 2;
            }
        }
        for(int num : res){
            System.out.print(num+" ");
        }
    
    }
}

public class rearrangeArray {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1,2,-4,-5};
        System.out.println("Brute Force Approach");
        sol.bruteForce(arr1);
        int[] arr2 = {1,2,-4,-5};
        System.out.println("\nOptimal Approach");
        sol.optimal(arr2);
    }
}
