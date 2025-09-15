import java.util.*;
public class AppearsOnce{
    private static int bruteforce(int[] arr){
        int count;
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            count =0;
            //System.out.print(arr[i] + " ");
            for(int j = 0; j < n ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
    private static int betterapproach(int[] arr){
        int n = arr.length;
        //find maximum 
        int max=Integer.MIN_VALUE;
        for(int i = 0 ; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        // the maximum size of hash array can be maximum
        int[] hash = new int[max+1];
        for(int i =0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i = 0; i<hash.length;i++){
            if(hash[i] == 1){
                return i;
            }
        }
        return -1;
    }
    private static int optimal(int[] arr){
        int xor = 0;
        for(int i = 0 ; i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String args[]){
        int[] arr = {8,4,1,6,2,2,4,6,1};
        
        System.out.println(bruteforce(arr));
        System.out.println(betterapproach(arr));
        // there is also an another better approach which uses HashMap(unordered map)... So time complexity will be O(n*log(m))+O(m)
        System.out.println(optimal(arr));// time complexity : O(n)

    }
}