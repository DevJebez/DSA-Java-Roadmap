import java.util.Scanner;
public class pattern19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:"); int n = sc.nextInt();
        int total_col = 2*n;
        int total_spaces = 2*n;
        //first part
        for(int i = n; i>0 ; i --){
            //left part - decreasing star
            for(int j = 0; j<i ; j++){
                System.out.print("*");
            }
            //mid part - spaces
            for(int j = (n*2)-i*2;j >0 ; j--){
                System.out.print(" ");
            }
            //right part - decreasing star pattern
            for(int j = 0; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second part
        for(int i = 0; i<n ; i++){
            //left part - increasing star
            for(int j = 0; j<=i ; j++){
                System.out.print("*");
            }
            //mid part - spaces
            for(int j = ((n-1)*2)-i*2;j > 0 ; j--){
                System.out.print(" ");
            }
            //right part - increasing star pattern
            for(int j = 0; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}