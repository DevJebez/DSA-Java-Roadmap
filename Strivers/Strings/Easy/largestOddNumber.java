
class Solution{
    public String bruteForce(String s){
        int n=s.length();
        int max=Integer.MIN_VALUE;
        for(int i = n - 1; i>=0 ; i--){
            if(s.charAt(i) == '0'){
                continue;
            }
            String sub = s.substring(i, n);
            int x = Integer.parseInt(sub);
            if(x > max && x % 2 == 1){
                max = x;

            }
        }
        if(max == Integer.MIN_VALUE){
            return "";
        }
        String str = String.valueOf(max);
        return str;
    }
    public String optimal(String s){
        int end = -1;
        int i;
        for(i = s.length() - 1; i>=0; i--){
            if((s.charAt(i) - '0') % 2 == 1){
                end = i;
                break;
            }
        } 
        if(i == -1) return "";
        i = 0;
        while( i <= end && s.charAt(i) == '0') i++;
        return s.substring(i, end + 1);
    }
}
public class largestOddNumber{
    public static void main(String args[]){
        String s = "01265123";
        Solution sol = new Solution();
        System.out.println("Brute force approach:"+sol.bruteForce(s));
        System.out.println("Optimal approach:"+sol.optimal(s));
    }
}