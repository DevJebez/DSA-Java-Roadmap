import java.util.*;

public class union {
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int[] twopointers(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else { // arr1[i] == arr2[j]
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        int[] result = new int[union.size()];
        for (int k = 0; k < union.size(); k++) {
            result[k] = union.get(k);
        }
        return result;
    }

    private static int[] bruteforce(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if (!union.contains(arr2[j])) {
                union.add(arr2[j]);
            }
        }

        int[] result = new int[union.size()];
        for (int k = 0; k < union.size(); k++) {
            result[k] = union.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 3, 4, 5};

        int[] result = bruteforce(arr1, arr2);
        int[] optimal_result = twopointers(arr1, arr2);

        System.out.println("Bruteforce result:");
        printArray(result);

        System.out.println("Two-pointers result:");
        printArray(optimal_result);
    }
}
