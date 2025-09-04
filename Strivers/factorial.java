public class factorial{
    //this is functional way of solving recursion 
    static int factorial_functional(int n){
        if(n==1 || n == 0){
            return 1;
        }
        else{
            return n * factorial_functional(n-1);
        }
    }
    //this is parameterized way of solving factorial
    static void factorial_parametrized(int n, int fact){
        if(n<1){
            System.out.println(fact);
            return;
        }
        factorial_parametrized(n-1,fact*n);
    }
    //this is iterative method 
    static void fact(int n){
        int fact = 1;
        if(n==1 || n==0){
            System.out.println(1);
            return;
        }
        else{
            for(int i = 1; i<= n;i++){
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
    public static void main(String args[]){
        factorial_parametrized(5,1);
        System.out.println(factorial_functional(5));
        fact(5);
    }
}