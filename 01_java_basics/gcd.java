import java.util.Scanner;

public class gcd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");int n = sc.nextInt();
        System.out.println("Enter a number:");int m = sc.nextInt();
        int res = gcd_euclid(n,m);
        System.out.println(res);
    }
    public static int gcd_euclid(int a, int b){
        if (b == 0) return a;
        return gcd_euclid(b, Math.abs(a-b));
    }
}