public class Myatoi{
    public static void main(String args[]){
        String s = " 1231231231311133";
        int sign = 1; //default set to postive 
        int i = 0;
        int result = 0;
        //skipping all the white spaces
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        //find the sign
        while(i < s.length() && s.charAt(i) == '+' || s.charAt(i) == '-'){
            if(s.charAt(i) == '-'){
                //change the sign 
                sign = -1;
                i++;
            }
        }
        //convert the numbers
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0'; // in java ASCII is used internally (0 - 48, 1 - 49 , 2 -50)
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE/10 && digit > 7)){
                if(sign == 1){
                    result = Integer.MAX_VALUE;
                    break;
                }   
                else if(sign == -1 ){
                    result = Integer.MIN_VALUE;
                    break;
                }
            }
            result += result * 10 + digit;
            i++;
        }
        result = result * sign;
        System.out.println(result);
    }
}