import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class factors{
    public static void factorList(int n){
        List<Integer> smallDivisors = new ArrayList<>();
        List<Integer> largeDivisors  = new ArrayList<>();
        for(int i = 1; i<=Math.sqrt(n); i++){
            if (n%i == 0){
                smallDivisors.add(i);
                if (n/i != i)
                    largeDivisors.add(n/i);

            }   

        }
        //combine two lists 
        Collections.reverse(largeDivisors);
        smallDivisors.addAll(largeDivisors);
        System.out.println("Stored in a list");
        for( int i:smallDivisors){
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:"); int n = sc.nextInt();
        factorList(n);
        System.out.println("\nManual calculation");
        for(int i = 1; i<=Math.sqrt(n); i++){
            if (n % i == 0){
                if(n/i == i)
                    System.out.print(i+ " ");
                else
                    System.out.print(i+ " "+ n/i +" ");
            }
        }
    }
} 
