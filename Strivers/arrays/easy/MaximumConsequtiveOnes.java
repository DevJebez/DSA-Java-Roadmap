public class MaximumConsequtiveOnes{
    private static int Solution(int[] arr){
        int n = arr.length;
        int max_count = 0;
        int count = 0;
        for(int i = 0; i<n ;i++){
            if(count > max_count){
                max_count = count;
            }
            if(arr[i] == 0){
                count = 0;
            }
            else{
                count++;
            }
        }
        return max_count;
    }
    public static void main(String args[]){
        int[] arr = {1,1,1,0,0,1,0,0,1,1,1,1,0};
        System.out.println(Solution(arr));
    }
}