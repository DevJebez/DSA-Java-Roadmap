class Solution {

    public int bruteForce(int[] arr,int  x) {
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > x){
                return i;
            }
        }
        return arr.length;
    }
    public int optimal(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        int ans = arr.length;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] > x){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
}

public class upperBound {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,2,2,3,5,7,9,12};
        int x = 2;
        System.out.println("Brute Force Approach");
        System.out.println(sol.bruteForce(arr, x));

        System.out.println("Optimal Approach");
        System.out.println(sol.optimal(arr, x));
    }
}
