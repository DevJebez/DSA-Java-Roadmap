import java.util.Scanner;
public class linear_search{
    static int linearSearch(int arr[],int x){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x) return i;
        } 
       return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n ; i++){
            System.out.printf("Enter arr[%d]:",i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched:");int x = sc.nextInt();
        System.out.println(linearSearch(arr,x));
    }
}