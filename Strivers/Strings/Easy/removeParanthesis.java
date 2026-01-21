import java.util.*;
class Solution{
    public String singleSol(String s){
        StringBuilder res = new StringBuilder();
        int level = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(level > 0) res.append(ch);
                level++;
            }else if(ch == ')'){
                level--;
                if(level>0) res.append(ch);
            }
        }
        return res.toString();
    }
}
public class removeParanthesis{
    public static void main(String args[]){
        String s = "(()())(())";
        Solution sol = new Solution();
        System.out.println("Result:"+sol.singleSol(s));
    }
}