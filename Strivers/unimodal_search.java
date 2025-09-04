import java.util.Scanner;
public class unimodal_search{
    public int maxValUnimodalSearch(int arr[]){

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