class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, k = Math.max(i, j) + 2;
        char[] res = new char[k];
        int carry = 0, p = k - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            res[p--] = (char) ('0' + (sum % 2));
            carry = sum / 2;
        }
        return new String(res, p + 1, k - p - 1);
    }
}