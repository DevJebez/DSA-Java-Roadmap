import java.util.Scanner;
public class square_root{
    public static int optimalApproach(int n){
        if(n<2) return n;
        int high = n;
        int low = 1;
        int ans = 0;
        while(low<= high){
            int mid = low + (high - low)/2;
            //System.out.println(mid);
            if (mid <= n/mid){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    } 
    public static int expectedApproach(int n){
        int res = 0;
        int i = 1;
        while(i * i <= n){
            res = i;
            i++;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");int a = sc.nextInt();
        System.out.println(expectedApproach(a));
        System.out.println(optimalApproach(a));
    }
}