public class reverseExponentiation{

    public static void main(String[] args){
        int n = 10;
        int temp = n;
        int rev = reverse(n,0,1);
        System.out.println(rev);
        System.out.println((int) Math.pow(n,rev));
    }   

    public static int reverse(int n,int revNum,int basepos){
        if(n>0){
            reverse(n/10,revNum,basepos);
            revNum += (n%10) * basepos;
            basepos *= 10;
        }
        return revNum;
    }
}
