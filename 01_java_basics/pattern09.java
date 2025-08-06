//diamond star pattern
import java.util.Scanner;
public class pattern09{
    static void erect_pyramid(int N){
        for(int i = 0; i < N; i++){
            for(int j = 0 ;j < N-i-1; j++ ){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*i + 1 ; j++ ){
                System.out.print("*");  
            }
            for(int j = 0 ; j <= N-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void inverted_pyramid(int n){
        for(int i = n-1; i >= 0 ; i--){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*i + 1 ; j++){
                System.out.print("*");
            }
            for(int j = 0; j< n-i-1; j ++){
                System.out.print(" ");
            }
            System.out.println();
        }       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");int n =sc.nextInt();
        erect_pyramid(n);
        inverted_pyramid(n);
    }
}