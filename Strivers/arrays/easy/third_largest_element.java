import java.util.Scanner;
public class third_largest_element{
    static int solution(int arr[]){
        int third_largest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i : arr){
            if (i > largest){
                third_largest = second_largest;
                second_largest = largest;
                largest = i;
            }
            else if(i > second_largest){

                third_largest = second_largest;
                second_largest = i;
            }
            else if(i> third_largest){
                third_largest = i;
            }
            System.out.println(largest + " " + second_largest + " "+ third_largest);
        }
        return third_largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            System.out.printf("Enter element %d:",i);
            arr[i]=sc.nextInt();
        }
        System.out.println("The third largest element is :"+solution(arr));
    }
}