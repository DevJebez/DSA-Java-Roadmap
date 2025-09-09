import java.util.*;
public class removeduplicates{
    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    static int bruteforce(int[] arr, int n){
        HashSet <Integer> set = new HashSet< >();
        for(int num : arr){
            set.add(num);
        }
        int k = set.size();
        int j = 0;
        for(int x : arr){
            arr[j++] = x;
        }
        return k;
    }
    static int optimal(int[] arr, int n){
        int l = 1;
        int r = 1;
        while(r < n){
            if(arr[r] !=  arr[r-1]){
                arr[l++] = arr[r];
            }
            r++;
        }
        return l;
    }
    public static void main(String args[]){
        int[] arr = {1,1,1,2,2,2,3,3,3,3};
        int n = arr.length;
        System.out.println(bruteforce(arr, n));
        System.out.println(optimal(arr,n));

    }
}