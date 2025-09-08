import java.util.*;
public class bubblesort{
    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
    public static void main(String args[]){
        int[] arr = {14,55,22,66,35,2};
        int n = arr.length;
        System.out.println("Before sorting:");
        printArray(arr);
        //push each element into the bubble which is at the last
        //we don't touch the bubble 
        for(int i = n-1 ; i >= 0 ; i--){
            for(int j = 0; j <= i-1; j++ ){
                if(arr[j] > arr[j+1]){
                    //swap 
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    int swap = 1;
                }
            }
            //optimization if no swaps are done in the first iteration - array is in ascending order
            if(swap == 0){
                break;
            }
        }
        System.out.println("\nAfter sorting:");
        printArray(arr);
    }
}