import java.util.*;
public class FrequencyArray{
    public static void main(String args[]){
        int arr[] = {10,5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }
    // This approach has time complexity of O(N*N) 
    // 1. Create a visited , a boolean array 
    // 2. Use the first loop to point to the array element 
    // 3. Initialize count = 1
    // 4. Make the index true in the visited array 
    // 5. Make the second loop so that it runs and updates count if same element is found 
    // 6. Display the frequency 
    static void countFreq(int arr[],int n){
        boolean visited[] = new boolean[n];
        for(int i = 0; i<n ; i++){
            if(visited[i] ==  true){
                continue;
            }
            int count = 1;
            for(int j = i+1 ; j < n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }

    }
}