import java.util.Scanner;
public class prime_number {
    static boolean isPrime(int n) {
        if(n<=1) return false;
        if(n==2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i*i <= n; i++){
            if(n%i == 0)
                return false;
        }
        return true;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:"); int n = sc.nextInt();
        System.out.println("Prime:"+isPrime(n));
    }
}
