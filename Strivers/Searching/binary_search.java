
import java.util.Scanner;
import java.util.Arrays;
public class binary_search{
    static int binarySearch(int arr[],int x){
        int low = 0,high = arr.length - 1;
        while(low<=high){
            int mid = low +(high - low)/2;
            if(arr[mid] == x) return mid;
            else if (arr[mid] < x) low = mid + 1;
            else high = mid -1;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("+++++++++++++++++Enter sorted array++++++++++++++++++++")
        for(int i = 0; i< n ; i++){
            System.out.printf("Enter arr[%d]:",i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched:");int x = sc.nextInt();
        //we sort the array

        System.out.println("Element at index:"+ binarySearch(arr,x));
    }
}