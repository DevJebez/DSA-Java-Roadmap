import java.util.*;
public class checksorted{
    static boolean bruteforce(int[] arr, int n){
        for(int i = 0 ; i<n;i++){
            for(int j = i+1; j<n ; j++){
                if(arr[j] < arr[i]) // to check descending arr[j] > arr[i]
                    return false;
            }
        }
        return true;
    }
    static boolean optimal(int[] arr, int n){
        for(int i = 1; i < n;i++){
            if (arr[i] < arr[i-1]){ // to check descending arr[i] > arr[i-1]
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        //to check whether the given array is sorted in ascending order or not
        int[] arr = {1,2,3,4,6,6};
        int n= arr.length;
        if(optimal(arr,n) && bruteforce(arr,n)) System.out.println("Sorted");
        else System.out.println("Not sorted");
        
    }
}