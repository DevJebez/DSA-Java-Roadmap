class Solution {

    public int bruteForce(int[] arr) {
        int pos = 0, neg = 0;
        for(int i:arr){
            if (i > 0){
                pos++;
            }else if(i < 0){
                neg++;
            }
        }
        return Math.max(pos, neg);
    }

    public int optimal(int[] arr) {
        int n = arr.length;
        int firstPos = minPos(arr);
        int lastNeg = maxNeg(arr);
        int negatives = (lastNeg == -1) ? 0 : (lastNeg+1);
        int positives = (firstPos == -1) ? 0 : (n - firstPos);
        return Math.max(negatives, positives);
    }
    private int minPos(int[] arr){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] > 0){
                ans = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
    private int maxNeg(int[] arr){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] < 0){
                //search the right for next maximum greatest negative
                ans = mid;
                l = mid + 1;
            }
            else{
                //search the left for next minimum positive 
                r = mid - 1;
            }
        }
        return ans;
    }
}

public class maximumCount {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {-55,54,75,99,101,125};
        System.out.println("Brute Force Approach");
        System.out.println(sol.bruteForce(arr));

        System.out.println("Optimal Approach");
        System.out.println(sol.optimal(arr));
    }
}
