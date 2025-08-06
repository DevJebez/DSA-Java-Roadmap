/*
Examples:

Input Format: N = 3
Result: 
A B C
A B
A

Input Format: N = 6
Result:   
A B C D E F
A B C D E 
A B C D
A B C
A B
A
*/
import java.util.Scanner;
public class pattern15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(char ch = 'A' ; ch < 'A'+n-i ; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}