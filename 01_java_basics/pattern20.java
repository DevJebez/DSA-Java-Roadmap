import java.util.Scanner;
public class pattern20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:"); int n = sc.nextInt();
        int spaces = n*2 ;
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
            for(int j = ((n-1)*2)-i*2;j > 0 ; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i > 0; i--){
            for(int j = i; j > 0 ;j--){
                System.out.print("*");
            }
            for(int j = 0;j < (n*2)-i*2; j++){
                System.out.print(" ");
            }
            for(int j = i; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}