import java.util.Scanner;
public class hashing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.printf("Enter arr[%s]:",i);arr[i] = sc.nextInt();
        }
        //usually we create a hash array of size largest + 1.
        // now we use precompute and fetch method 
        //we constraint the hash array size to be 10(so we do hash[arr[i]%10])
        int[] hash = new int[10];
        for(int i = 0;i < n; i++){
            hash[arr[i]%10] += 1;
        }
        System.out.println("The hash array is:");
        for(int num:hash){
            System.out.print(num+" ");
        }
        // now we accept user queries
        System.out.println();
        System.out.print("Enter number of queries:");int q = sc.nextInt();
        while(q-- >0){
            System.out.print("Enter query:");int num = sc.nextInt();
            System.out.println("Frequency: "+hash[num%10]);
        }

    }
}