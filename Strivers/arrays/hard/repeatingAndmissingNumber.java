import java.util.*;

class Solution{
    public int[] bruteForce(int[] arr){
        int missingNumber = -1;
        int n = arr.length;
        int repeatingNumber = -1;
        //number ranges from 1 to n inclusive
        for(int i = 1; i <= n;i++){
            int count = 0;
            for(int j = 0; j<n;j++){
                if(arr[j] == i){
                    count++;
                }
            }
            if(count == 2){
                repeatingNumber = i;
            }else if(count == 0){
                missingNumber = i;
            }
            if(missingNumber != -1 && repeatingNumber != -1){
                break;
            }
        }
        return new int[]{repeatingNumber, missingNumber};
    }
    public int[] optimal(int[] arr){
        HashMap<Integer, Integer> unique = new HashMap<>();
        int xor = 0;
        int xor1 = 0;
        int repeatingNumber = -1;

        for(int i = 0 ; i < arr.length; i++){
            if(!unique.containsKey(arr[i])){ 
                unique.put(arr[i],1);
                xor = xor ^ arr[i];
                xor1 = xor1 ^ (i+1);
            } else {
                unique.put(arr[i],2);
                repeatingNumber = arr[i];
            }
        }
        return new int[]{repeatingNumber, xor ^ xor1};
    }


}
public class repeatingAndmissingNumber{
    public static void main(String args[]){
        //the array ranges from 1 to n
        int[] arr = {1,2,3,5,6,7,7};
        Solution sol = new Solution();
        int[] res1 = sol.bruteForce(arr);
        int[] res2 = sol.optimal(arr);
        System.out.println(Arrays.toString(res2));
        /*
        int xor = 0;
        for(int n : arr){
            xor = xor ^ n;
            System.out.println(xor);
        }
        System.out.println(xor ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 7);
        */
    }
}