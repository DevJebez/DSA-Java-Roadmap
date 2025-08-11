public class sum_of_numbers{
    static void solve_loop(int n){
        int sum = 0;
        for(int i = 1; i<=n ; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
    static void solve_formula(int n){
        int sum = n*(n+1) / 2;
        System.out.println(sum);
    }
    //paramterized way of recursion
    static void recursion_parameterized(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        recursion_parameterized(i-1,sum+i);
    }
    // functional way - the problem is beoken down into two subparts

    static int recursion_functional(int n){
        if(n == 0){
            return 0;
        }
        return n+recursion_functional(n-1);
    }

    public static void main(String args[]){
        int n = 10;
        solve_formula(n);
        solve_loop(10);
        recursion_parameterized(10,0); // func(i,sum)
        System.out.println(recursion_functional(10));
    }
}