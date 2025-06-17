import java.util.*;

public class LastDigitofString {
    
    public static int getLastDigit(String a, String b) {
        // Step 1: Get the last digit of base 'a'
        int lastDigitOfA = a.charAt(a.length() - 1) - '0';

        // Step 2: Handle edge case where b = "0" (a^0 = 1 for any a ≠ 0)
        if (b.equals("0")) return 1;

        // Step 3: Build the cycle of last digits
        List<Integer> cycle = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        int power = 1;
        while (true) {
            int digit = (int) Math.pow(lastDigitOfA, power) % 10;
            if (seen.contains(digit)) break;
            cycle.add(digit);
            seen.add(digit);
            power++;
        }

        // Step 4: Compute b mod cycle length using digit-by-digit simulation
        int bMod = 0;
        int cycleLength = cycle.size();
        for (int i = 0; i < b.length(); i++) {
            int digit = b.charAt(i) - '0';
            bMod = (bMod * 10 + digit) % cycleLength;
        }

        // Step 5: Adjust index (0-based)
        int index = (bMod == 0) ? cycleLength - 1 : bMod - 1;
        return cycle.get(index);
    }

    // Optional: Main method to test
    public static void main(String[] args) {
        System.out.println(getLastDigit("3", "10"));
        System.out.println(getLastDigit("6", "2")); 
        System.out.println(getLastDigit("7", "0"));
}
