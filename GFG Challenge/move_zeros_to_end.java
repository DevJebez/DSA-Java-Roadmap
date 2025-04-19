public class move_zeros_to_end{
    public static void main(String args[]){
        int arr[]  = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length - 1 ;
        int index = 0;
        for(int i = 0; i< n ; i++){
            if (arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < n){
            arr[index] = 0;
            index++;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    
    }
}