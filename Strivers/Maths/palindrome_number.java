import java.util.Scanner;

public class palindrome_number {
    public static boolean isPalindrome_String(int n){
        String s = Integer.toString(Math.abs(n));
        int len = s.length();
        for(int i = 0; i < len/2 ; i++){
            if(s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        return true;
    }
    public static boolean isPalindrome_number(int n) {
        int reverse = 0;
        int temp = n;
        while(temp >0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        if (n == reverse)
            return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");int a = sc.nextInt();
        System.out.println("Palindrome_method1:"+ isPalindrome_number(a));
        System.out.println("Palidrome_method2:" + isPalindrome_String(a));
    }
}