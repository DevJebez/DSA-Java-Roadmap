class Solution{
    public int bruteForce(int[] arr){
        int n = arr.length;
        if(n == 1) return arr[0];
        for(int i = 0; i < n;i++){
            if(i == 0){
                if(arr[i] != arr[i+1]){
                    return arr[i];
                }
            }else if(i == n - 1){
                if(arr[i] != arr[i - 1]){
                    return arr[i];
                }
            }else{
                if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                    return arr[i];
                    }
            }
        }
        return -1;
    }  
    public int optimal(int[] arr){
        // The pattern is every pair starts at even index and ends at odd index.
        // But this pattern breaks if a unique element appears
        // an element is unique if it is not equal to mid-1 and mid+1 element.
        int n= arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n - 1];
        int low = 1, high = n - 2;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return arr[mid];
            }
            if((mid % 2 == 0 && arr[mid] == arr[mid+1]) || (mid %2 == 1 && arr[mid] == arr[mid-1])){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}

public class singleNonDuplicate{
    public static void main(String args[]){
        int[] arr = {1,2,2,3,3,4,4,5,5,7,7};
        Solution sol = new Solution();
        int res = sol.bruteForce(arr);
        int res1 = sol.optimal(arr);
        System.out.println(res1);
    }
}