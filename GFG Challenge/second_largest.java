public class second_largest{
    public static void main(String[] args) {
        if(arr.length < 2){
            System.out.println("-1");
        }
        int max = -1;
        int second_max = -1;
        for(int num : arr){
            if(num>max){
                second_max = max; 
                max = num;
            }
            else if(num < max && num > second_max){
                second_max = num;
            }
        }
        System.out.println(second_max);
    }
}