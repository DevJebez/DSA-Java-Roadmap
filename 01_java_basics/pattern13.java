import java.util.Scanner;
public class pattern13{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:"); int n = sc.nextInt();
        int start = 1;
        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 1; j <= i; j++ ){
                System.out.print(start + " ");
                start += 1;
            }
            System.out.println();
        }
    }
}