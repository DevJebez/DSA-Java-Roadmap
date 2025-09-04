import java.util.Scanner;
public class pattern01{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of lines: "); int n = s.nextInt();
        for(int i = 0; i <n ; i++){
            String repeatedString = "*".repeat(n);
            System.out.println(repeatedString);
        }
    }
}