class Solution {
    public String multiply(String num1, String num2) {
        // Edge case handling
        if (num1.equals("0") || num2.equals("0")) return "0";
        
        // Handle and track the final sign
        boolean isNegative = false;
        if (num1.charAt(0) == '-') {
            isNegative = !isNegative;
            num1 = num1.substring(1);
        }
        if (num2.charAt(0) == '-') {
            isNegative = !isNegative;
            num2 = num2.substring(1);
        }

        int len1 = num1.length();
        int len2 = num2.length();
        // The maximum possible length of the product is len1 + len2
        int[] result = new int[len1 + len2];

        // 1. Grade-school multiplication from right to left
        for (int i = len1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0'; // ASCII math conversion

            for (int j = len2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';

                // Multiply digits and add to the existing value at this position
                int product = digit1 * digit2;
                int position1 = i + j;
                int position2 = i + j + 1;
                
                int totalSum = product + result[position2];

                // 2. Distribute the product and the carry-over
                result[position2] = totalSum % 10;
                result[position1] += totalSum / 10;
            }
        }

        // 3. Convert the result array back to a string
        StringBuilder sb = new StringBuilder();
        if (isNegative) sb.append('-');

        for (int digit : result) {
            // Skip any leading zeros in the result array
            if (!(sb.length() == 0 || (sb.length() == 1 && sb.charAt(0) == '-')) || digit != 0) {
                sb.append(digit);
            }
        }

        return sb.length() == 0 || sb.toString().equals("-") ? "0" : sb.toString();
    }
}