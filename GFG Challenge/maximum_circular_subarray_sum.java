public class maximum_circular_subarray_sum{
    static int  brute_force(int[] arr){
        int result = 0;
        //circular array - (i+j) % n 
        int n = arr.length;
        for(int i=0;i<n;i++){
            int current_sum = 0;
            for(int j = 0;j<n ; j++){
                int idx = (i+j)%n;
                current_sum = current_sum + arr[idx];
                result = Math.max(result, current_sum);
            }
        }
        return result;
    }
    static int optimal_solution(int[] arr){
        int globalmax = arr[0];
        int globalmin = arr[0];
        int currMax = 0;
        int currMin = 0;
        int total = 0;
        for (int num : arr){
            currMax = Math.max(currMax+num,num);
            currMin = Math.min(currMin+num,num);
            total += num;
            globalmax = Math.max(globalmax, currMax);
            globalmin = Math.min(globalmin, currMin);
        }
        if(globalmax>0){
            return Math.max(globalmax, total - globalmin);
        }
        else{
            return globalmax;
        }
    }
    public static void main(String args[]){
        int arr[] =  {8, -8, 9, -9, 10, -11, 12};
        System.out.println("Maximum Circular subarray sum :"+ brute_force(arr));
        System.out.println("Maximum Circular subarray sum:" + optimal_solution(arr));
    }
}