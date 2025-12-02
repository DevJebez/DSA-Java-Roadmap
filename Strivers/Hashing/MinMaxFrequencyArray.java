import java.util.*;
public class MinMaxFrequencyArray{
    public static void main(String[] args){
        int[] arr = {10,20,10,50,60,3};
        int n = arr.length;
        System.out.println("Using Brute Force");MinMaxCountFreq(arr,n);
        System.out.println("Optimal approach");OptimalApproach(arr,n);
    }
    //Time Complexity: O(N*N), where N = size of the array. We are using the nested loop to find the frequency.
    //Space Complexity:  O(N), where N = size of the array. It is for the visited array we are using.
    static void MinMaxCountFreq(int arr[] , int n){
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
        System.out.println("Lowest frequency element:"+minelement);
    }
    //optimal approach using hashmap in java
    static void OptimalApproach(int arr[], int n){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //find the max and min frequency
        int maxcount = 0;
        int mincount = n;
        int minelement = 0;
        int maxelement = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            if(count > maxcount){
                maxcount = count;
                maxelement = element;
            }
            if(count < mincount){
                mincount = count;
                minelement = element;
            }
        }
        System.out.println("Highest frequency element:"+maxelement);
        System.out.println("Lowest frequency element:"+minelement);
    }
}