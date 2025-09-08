import java.util.*;
public class selectionsort{
    public static void main(String args[]){
        int[] arr = {10,25,3,55,1,11};
        for(int i = 0 ; i < arr.length - 1; i++){
            //find minimum
            int mini = i;
            for(int j = i+1 ; j < arr.length - 1; j++){
                if (arr[j] < arr[mini]){
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection sort:");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
    }
}