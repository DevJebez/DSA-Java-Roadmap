import java.util.*;

class Solution{
    public int[] bruteforce(int[] arr, int target){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            for(int j = i; j <n; j++){
                if(arr[i] + arr[j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public int[] Better(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <arr.length; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem))
                return new int[]{map.get(rem),i};
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public int[] Optimal(int[] arr, int target){
        int n = arr.length;
        int[][] new_arr = new int[n][2];
        for(int i = 0;i <n;i++){
            new_arr[i][0]=arr[i];
            new_arr[i][1]=i;
        }
        Arrays.sort(new_arr,(a,b)->Integer.compare(a[0],b[0]));
        int left = 0;
        int right = n-1;
        while(left < right){
            int sum = new_arr[left][0]+new_arr[right][0];
            if(sum == target){
                return new int[] {new_arr[left][1],new_arr[right][1]};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[] {-1,-1};

    }
}
public class TwoSum{
    public static void main(String[] args){ 
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        Solution sol = new Solution();
        System.out.println("Brute Force Solution:");
        int[] res1 = sol.bruteforce(arr, target);
        System.out.println("[" + res1[0] + ", " + res1[1] + "]");
        System.out.println("Better Approach:");
        int[] res2 = sol.Better(arr, target);
        System.out.println("[" + res2[0] + ", " + res2[1] + "]");
        int[] res3 = sol.Optimal(arr, target);
        System.out.println("Optimal Approach:");
        System.out.println("[" + res3[0] + ", " + res3[1] + "]");

    }
}