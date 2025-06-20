//to print a inverted start pyramid
import java.util.Scanner;
public class pattern07{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N:"); int n = sc.nextInt();
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
}