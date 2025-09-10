import java.util.*;
public class leftrotate{
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void optimal(int[] arr, int n){
        int temp = arr[0];
        int j = 0;
        for(int i = 1; i< n;i++){
            arr[j] = arr[i];
            j++;
        }
        arr[n-1] = temp;
        printArray(arr);
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        optimal(arr,n);
        //brute force solution uses O(N) extra space. A new array is used to store the elements.
    }
}