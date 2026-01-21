import java.util.*;
class Solution{
    public String bruteForce(String s){
        List<String> result = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                word.append(s.charAt(i));
            }else if(word.length() > 0){
                result.add(word.toString());
                word.setLength(0);
            }
        
        }
        //to add the last word
        if(word.length() > 0){
            result.add(word.toString());
        }
        Collections.reverse(result);
        return String.join(" ",result);
    }
    public String optimal(String s){
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        while(i >= 0){
            while(i>= 0 && s.charAt(i) == ' '){
                i--;
            }
            if(i < 0) break;
            //marking the end of the word
            int end = i;
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            // note :  it is not subString(int, int) check the camelcase
            String word = s.substring(i+1, end + 1);
            if(result.length() > 0){
                result.append(" ");
            }
            result.append(word);
        }
        return result.toString();
    }
}
public class ReverseWords{
    public static void main(String args[]){
        String s = "     hello   world   ";
        Solution sol = new Solution();
        System.out.println("String after reversal :"+sol.bruteForce(s));
        System.out.println("String after reversal :"+sol.optimal(s));
    }
}