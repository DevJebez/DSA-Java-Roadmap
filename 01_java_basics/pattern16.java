/*

Examples:

Input Format: N = 3
Result: 
A
B B
C C C

Input Format: N = 6
Result:   
A 
B B
C C C
D D D D
E E E E E
F F F F F F
Solution
*/

import java.util.Scanner;

public class pattern16{
    public static void main(String args[]){
        char ch = 'A';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:"); int n = sc.nextInt();
        for(int i = 1 ; i<= n; i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch+=1;
        }
    }
}