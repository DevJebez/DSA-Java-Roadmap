import java.util.Scanner;

public class fibonacci {
    static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    static void fibIterative(int n) {
        if (n <= 0) return;
        if (n == 1) {
            System.out.println(0);
            return;
        }
        
        int prev = 0, curr = 1;
        System.out.println(prev);
        System.out.println(curr);
        
        for (int i = 2; i < n; i++) {
            int total = curr + prev;
            System.out.println(total);
            prev = curr;
            curr = total;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci using iteration:");
        fibIterative(n);

        System.out.println("Fibonacci using recursion:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibRecursive(i));
        }
    }
}
