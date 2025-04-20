public class reverse_an_array{
    public static void main(String args[]){
        int arr[] = {1, 4, 3, 2, 6, 5};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int num: arr){
            System.out.println(num);
        }
    }
}