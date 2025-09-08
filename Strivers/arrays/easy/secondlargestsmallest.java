import java.util.*;
public class secondlargestsmallest{
    static void BruteForce(int[] arr, int n){
        if(n==0 || n == 1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        //we sort the array 
        Arrays.sort(arr);
        System.out.println("Second largest : "+ arr[n-2]);
        System.out.println("Second smallest :"+ arr[1]);
    }
    static void Better(int[] arr , int n ){
        if(n == 0 || n == 1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < n; i++){
            smallest= Math.min(smallest, arr[i]);
            largest = Math.max(largest , arr[i]);
        }
        for(int j = 0 ; j< n; j++){
            if (arr[j] < second_smallest && arr[j] != smallest){
                second_smallest = arr[j];
            }
            if(arr[j] > second_largest && arr[j] != largest){
                second_largest = arr[j];
            }
        }
        System.out.println("Second largest : "+second_largest);
        System.out.println("Second smallest :" +second_smallest);
    }
    private static int secondLargest(int[] arr, int n){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                second_largest = largest;
                largest = num;
            }
            else if(num > second_largest && num != largest){
                second_largest = largest;
            }
        }
        return second_largest;
    }
    private static int secondSmallest(int[] arr, int n){
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MIN_VALUE;
        for(int num: arr){
            if (num < smallest){
                second_smallest = smallest;
                smallest = num;
            }
            else if(num < second_smallest && num != smallest){
                second_smallest = num;
            }
        }
        return second_smallest;
    }
    static void Optimal(int[] arr , int n){
        int second_largest = secondLargest(arr,n);
        int second_smallest = secondSmallest(arr,n);
        System.out.println("Second largest:"+ second_largest);
        System.out.println("Second smallest:"+second_smallest);
    }
    public static void main(String args[]){
        int[] arr = {1,2,4,7,5};
        int n = arr.length;
        System.out.println("Brute force approach");BruteForce(arr,n); // works only for non duplicate values
        System.out.println("\nBetter approach");Better(arr,n);
        System.out.println("\nOptimal approach");Optimal(arr,n);
    }
}