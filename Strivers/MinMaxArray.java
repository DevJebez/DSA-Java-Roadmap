import java.util.Scanner;

//a template function to return a pair of value from a function
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class MinMaxArray{
    static Pair<Integer,Integer> getMinMax(int[] arr){
        int maximum = arr[0];
        int minimum = arr[0];
        for(int i : arr){
            if(i > maximum){
                maximum = i;
            }
            else if( i < minimum){
                minimum = i;
            }
        }
        return new Pair<Integer, Integer>(maximum, minimum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:"); int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            System.out.printf("Enter element %d:",i);
            arr[i]=sc.nextInt();
        }
        Pair<Integer, Integer> result = getMinMax(arr);
        System.out.printf("The maximum is %d\nThe minimum is %d\n", result.getKey(), result.getValue());

    }
}