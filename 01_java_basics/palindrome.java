public class palindrome{
    static boolean PalindromeRecursive(int i, String s){
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return PalindromeRecursive(i+1,s);
    }
    static private boolean isPalindrome(String str){
        int left = 0, right = str.length() -1;
        while(left < right){
            char l = str.charAt(left), r = str.charAt(right);
            if(!Character.isLetterOrDigit(l))
                left++;
            else if(!Character.isLetterOrDigit(r))
                right--;
            else if(Character.toLowerCase(l) != Character.toLowerCase(r))
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "ABCDCBA";
        if (isPalindrome(s1) && PalindromeRecursive(0,s1)){
            System.out.println("Palindrome");
        }
        else 
            System.out.println("Not a palindrome");
    }
}