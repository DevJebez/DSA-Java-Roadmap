/*
Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
Find the number(between 1 to N), that is not present in the given array.

*/
public class findmissingnumber{
    private static int betterapproach(int[] arr, int n){
       //using hash array 
       //create a new hash array of size  n+1 
       int hash[] = new int[n+1];// the default value for integer array is zero
       // this loop has O(n) runtime
       for(int i = 0 ; i<n-1 ;i++){
        hash[arr[i]]++;
       }
       // this loop has O(n) runtime
       for(int i = 1;i<=n;i++){
        if(hash[i] == 0){
            return i;
        }
       }
       return -1;

    }
    private static int bruteforce(int[] arr, int n){
        // the ideal list contains 1 to n numbers 
        // we use two for loops. Take element from ideal array and perform linear search across the given array
        int flag;
        for(int i = 1 ; i<=n ;i++){
            flag = 0;
            for(int j = 0; j<n-1;j++){
                if(arr[j] == i){
                    flag =1;
                }
            }
            if(flag == 0){
                return i;
            }
        } 
        return -1;
        
    }
    private static int optimal(int[] arr, int n){
        //using maths 
        //find the sum and subtract from ideal sum
        int sum = 0;
        for(int i = 0; i< n-1 ;i++){
            sum+= arr[i];
        }
        int idealSum = (n*(n+1))/2;
        return idealSum - sum;
    }
    private static int XOR(int[] arr, int n){
        int xor1=0;
        int xor2 = 0;
        for(int i = 0; i < n-1 ; i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);

    }
    public static void main(String args[]){
        int n = 6;
        int[] arr = {2,3,1,4,6}; // contains n-1 elements  
        System.out.println(bruteforce(arr, n));
        System.out.println(betterapproach(arr,n)); // Time : O(n) + O(n) , Space : O(n) - to store hash array
        System.out.println(optimal(arr,n)); //Time : O(n) - to calculate sum, Space : O(1)
        System.out.println(XOR(arr,n));

    }
}