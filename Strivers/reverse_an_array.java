public class reverse_an_array{
    static void printArray(int arr[], int n){
        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    //uses extra space of O(n)
    static void ReverseArray(int arr[], int n){
        int ans[] = new int[n];
        for(int i = n-1; i >= 0; i--){
            ans[n-i-1] = arr[i];
        }
        System.out.print("\nReversed array :");
        printArray(ans,n);
    }
    //using two pointers 
    static void TwoPointers(int arr[], int start , int end){
        int p1 = start;
        int p2 = end;
        while(p1< p2){
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
        System.out.print("\nReversed array:");printArray(arr,end+1);
    }
    //recursive approach
    static void recursive(int arr[], int start,int end){
        if(start <end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            recursive(arr, start+1, end-1);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int n = 6;
        System.out.print("Original array :");printArray(arr,n);
        ReverseArray(arr,n);
        TwoPointers(arr,0,n-1);
        int arr1[] = {1,2,3,4,5,6};
        recursive(arr1, 0, n-1);
        System.out.print("\nReversed array:");
        printArray(arr,n);
    }
}