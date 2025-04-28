

import java.util.Arrays;

class minimize_the_heightsII {
    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);

        int res = arr[n - 1] - arr[0];


        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - k < 0)
                continue;
            
            int minH = Math.min(arr[0] + k, arr[i] - k);

            // Maximum height after modification
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            res = Math.min(res, maxH - minH);
        }
        return res;
    }

    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1,5,8,10};

        int ans = getMinDiff(arr, k);
        System.out.println(ans);
    }
}