class Solution{
    public String optimal(String s){
        String ans = "";
        for(int i = 0; i < s.length() - 2; i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                String candidate = s.substring(i, i+3);
                if(ans.equals("")|| candidate.compareTo(ans) > 0){
                    ans = candidate;
                }
            }
        }
        return ans;
    }
}
public class largestThreeDigit{
    public static void main(String args[]){
        String s = "000777999123999";
        Solution sol = new Solution();
        System.out.println(sol.optimal(s));
    }
}