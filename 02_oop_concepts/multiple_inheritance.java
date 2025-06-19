import java.io.*;
interface Add{
    int add(int a, int b);
}
interface Sub{
    int sub(int a, int b);
}

class Calculator implements Add,Sub{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a+b;
    }
}
public class multiple_inheritance{
    public static void main(String args[]){
        Calculator x = new Calculator();
        System.out.println("Addition :"+x.add(1,2));
        System.out.println("Subtraction:"+x.sub(2,3));
    }
}