import java.math.BigInteger;
import java.util.Arrays;
class Solution {
        public static int[] plusOne(int[] digits) {
                int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increase the last non-9 digit
                return digits; // Return early if no carry is generated
            }
            digits[i] = 0; // Set current digit to 0 (carry over)
        }

        // If all digits were 9 (e.g., 999 → 1000), create a new array
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // First digit is 1, rest are 0s
        return newNumber;
    }
}