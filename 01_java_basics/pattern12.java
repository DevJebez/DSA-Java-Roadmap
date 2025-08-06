import java.util.Scanner;
public class pattern12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :"); int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(j);
            }
            for(int k = n*2-i*2; k >= 1 ; k--){
                System.out.print(" ");
            }
            for(int l = 1; l <= i; l++ ){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}