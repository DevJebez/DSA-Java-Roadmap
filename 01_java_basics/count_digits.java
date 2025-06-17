public class count_digits{
    public static void main(String args[]){
        int n = 39;
        int temp = n;
        int count = 0;
        while(temp > 0){
            int d = temp % 10;
            System.out.println(d);
            if(d !=0 && n % d == 0){
                count++;
            }
            temp = (int) (temp / 10);
        }
        System.out.println(count);
    }
}