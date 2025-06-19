import java.util.Scanner;

interface Display{
    void display(int a);
}

class TestPrime implements Display{
    private boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2 == 0) return false;
        for (int i = 3; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public void display(int k){
        int count = 0;
        for(int i = 2; i <= k;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println("There are "+count+" prime numbers");
    }

}

public class prime_number_interfaces{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  T = sc.nextInt();
        TestPrime obj = new TestPrime();
        obj.display(T);
        sc.close();
    }
}
