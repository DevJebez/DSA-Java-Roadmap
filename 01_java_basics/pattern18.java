import java.util.Scanner;
public class pattern18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :"); int n = sc.nextInt();
        for(int i = 0; i<n ; i++){
            for(char ch =(char)(int)('A'+n-i-1);ch <= (char)(int)('A'+n-1); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}