import java.util.*;
public class MaxFrequencyArray{
    public static void main(String[] args){
        int[] arr = {10,20,10,50,60,3};
        int n = arr.length;
        MaxCountFreq(arr,n);
    }
    static void MaxCountFreq(int arr[] , int n){
        boolean visited[] = new boolean[n];
        int maxcount = Integer.MIN_VALUE;
        int maxelement = 0;
        int mincount = Integer.MAX_VALUE;
        int minelement = 0;
        for(int i = 0;i < n ; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j= i+1; j<n ;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                maxelement =arr[i];
            }
            if(count < mincount){
                mincount = count;
                minelement = arr[i];
            }
        }
        System.out.println("Highest frequency element:"+maxelement);
        System.out.println("Lowest frequencu element:"+minelement);

    }
}