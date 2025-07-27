package org.example.easy.arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                carry = 1;
                continue;
            }
            if (digits[i] < 9) {
                digits[i] = digits[i] + carry;
                carry = 0;
            }
        }
        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
