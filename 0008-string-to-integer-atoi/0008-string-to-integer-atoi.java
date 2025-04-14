class Solution {
    public int myAtoi(String s) {
                s = s.trim(); // Remove leading/trailing whitespaces
        if (s.length() == 0) return 0;

        int sign = 1;
        int i = 0;
        long result = 0;

        // Check for '+' or '-'
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Check for overflow
            if (sign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * result);
    }
}