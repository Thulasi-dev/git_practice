// Company Tags
// Flipkart    Amazon    Microsoft    Samsung    Adobe    Google    Facebook

// Multiply two strings
// Given two numbers as strings s1 and s2. Calculate their Product.
// Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers.
// There can be zeros in the begining of the numbers. You don't need to specify '+' sign in the begining of positive numbers.

import java.util.*;

public class StringMultiplication {
    public String multiplyStrings(String s1, String s2) {
        // Handle the signs of the numbers
        boolean isNegative = false;
        if (s1.charAt(0) == '-') {
            isNegative = !isNegative;
            s1 = s1.substring(1);
        }
        if (s2.charAt(0) == '-') {
            isNegative = !isNegative;
            s2 = s2.substring(1);
        }

        // Remove leading zeros
        s1 = removeLeadingZeros(s1);
        s2 = removeLeadingZeros(s2);

        // If any number is zero, the product is zero
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        // Result array to store the multiplication result
        int m = s1.length(), n = s2.length();
        int[] result = new int[m + n];

        // Perform multiplication
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Convert the result array to a string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        // Add the negative sign if necessary
        if (isNegative) {
            sb.insert(0, '-');
        }

        return sb.toString();
    }

    private String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        return i == s.length() ? "0" : s.substring(i);
    }

    public static void main(String[] args) {
        StringMultiplication sm = new StringMultiplication();
        String s1 = "-123";
        String s2 = "456";

        String result = sm.multiplyStrings(s1, s2);
        System.out.println("The product of " + s1 + " and " + s2 + " is: " + result);
    }
}

// Input: s1 = "0033", s2 = "2"
// Output: "66"
// Explanation: 33 * 2 = 66
