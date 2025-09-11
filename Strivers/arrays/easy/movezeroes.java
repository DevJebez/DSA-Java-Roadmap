import java.util.ArrayList;

public class movezeroes {

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // for better readability
    }

    // Brute force approach using extra space
    static int[] bruteforce(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        int nz = temp.size();
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);  // FIXED
        }
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    // Optimal approach using two-pointer method
    static int[] optimal(int[] arr, int n) {
        int j = -1;
        // find first zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        // if no zero found, array is already fine
        if (j == -1) return arr;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr1 = {1, 0, 0, 1, 1, 2, 3, 4, 0, 12};
        int n1 = arr1.length;
        System.out.print("Original Array 1: ");
        printArray(arr1);
        int[] result1 = bruteforce(arr1, n1);
        System.out.print("Brute Force Result: ");
        printArray(result1);

        int[] arr2 = {0, 0, 1, 1, 1, 2, 3, 4, 0, 12};
        int n2 = arr2.length;
        System.out.print("Original Array 2: ");
        printArray(arr2);
        int[] result2 = optimal(arr2, n2);
        System.out.print("Optimal Result: ");
        printArray(result2);
    }
}
