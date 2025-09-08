import java.util.*;
public class insertionsort{
    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
    public static void main(String args[]){
        int[] arr = {13,22,14,46,55,1};
        //we sort the array inplace 
        int n = arr.length;
        //intial array
        System.out.println("Before sorting:");
        printArray(arr);
        for(int i =0; i < n ; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        //after sorting
        System.out.println("\nAfter sorting:");
        printArray(arr);
    }
}