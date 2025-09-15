/*

We are asked to find the union of two sorted arrays
1. Combine both array 
2. Remove the duplicates 
3. Return the array
*/

import java.util.*;

public class union {
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    private static int[] twopointers(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                if(union.size() == 0 || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(arr2[i] < arr1[j]){
                    if(union.size() == 0 || union.get(union.size()-1) != arr2[i]){
                        union.add(arr2[i]);
                    }
                j++;
                }
            }
        }
        while(i < arr1.length){
            if(union.get(union.size() - 1) != arr1[i]){
                union.add(arr1[i]);
            }
        }
        while(j < arr2.length){
            if(union.get(union.size()-1)!= arr2[j]){
                union.add(arr2[j]);
            }
        }
        int[] result = new int[union.size()];
        for (i = 0; i < union.size(); i++) {
            result[i] = union.get(i);
        }
        return result;
    }
    private static int[] bruteforce(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            if (!union.contains(arr1[i])) {  // remove duplicates from arr1
                union.add(arr1[i]);
            }
        }
        for (int j = 0; j < n2; j++) {
            if (!union.contains(arr2[j])) {  // remove duplicates from arr2
                union.add(arr2[j]);
            }
        }
        int[] result = new int[union.size()];
        for (i = 0; i < union.size(); i++) {
            result[i] = union.get(i);
        }

        return result; // return int[]
    }

    public static void main(String args[]) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 3, 4, 5};
        int[] result = bruteforce(arr1, arr2); // Time complexity 
        int[] optimal_result = twopointers(arr1, arr2);
        printArray(result);
    }
}
