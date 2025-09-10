import java.util.*;
public class RotateArray{
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    private static void rotate(int[] arr, int n, int k){
        k = k % n; //  to handle k > n 
        int j = n - k;
        for(int i = 0; i< k;i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
        printArray(arr);
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int k = 7;
        rotate(arr,n,k);
        //brute force solution uses O(N) extra space. A new array is used to store the elements.
    }
}