import java.util.Scanner;
public class recursion{
    static int c = 0;
    static void n_numbers(){
        if(c == 3) return;
        System.out.println(c);
        c = c + 1;
        n_numbers();
    }
    static void n_times_name(int n , int i){
        if(i>n) return;
        System.out.println("Jebez");
        n_times_name(n,i+1 );
    }
    public static void main(String args[]){
        n_numbers();
        n_times_name(5,0); //prints the name 6 times starting from 0
    }
}