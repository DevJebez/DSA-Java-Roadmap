class Solution{
    public void optimal(int[] a,int m,int[] b, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0){
            if(a[i] > b[j]){
                a[k--] = a[i--];
            }else{
                a[k--] = b[j--];
            }
        }
        while(j >= 0){
            a[k--] = b[j--];
        }

    }

}
public class mergeSortedArray{
    public static void main(String args[]){
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;

        new Solution().optimal(nums1,m,nums2,n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }
}