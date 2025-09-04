/*
Here, N = 5.

Examples:

Input Format: N = 3
Result: 
***
* *
***

Input Format: N = 6
Result:   
******
*    *
*    *
*    *
*    *
******
*/

import java.util.Scanner;
public class pattern21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:"); int n = sc.nextInt();
        for(int i =0 ; i< n; i++){
            for(int j = 0; j<n;j++){
                if(j == n-1 || j ==0 || i== 0 || i== n-1){
                    System.out.print("*");
                }
                else{ 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}