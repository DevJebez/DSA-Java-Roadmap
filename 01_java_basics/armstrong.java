import java.lang.Math;
import java.util.Scanner;
// User function Template for Java
public class armstrong {
    static boolean armstrongNumber(int n) {
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit,3);
            temp = temp/10;
        }
        if(sum == n)
            return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");int a = sc.nextInt();
        System.out.println("Armstrong:"+armstrongNumber(a));
    }
}