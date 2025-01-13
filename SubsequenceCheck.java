/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters
without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).*/

public class SubsequenceCheck {
    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0, tPointer = 0;

        // Traverse both strings
        while (sPointer < s.length() && tPointer < t.length()) {
            // If characters match, move the pointer of s
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            // Always move the pointer of t
            tPointer++;
        }

        // If we have traversed all characters of s, it is a subsequence
        return sPointer == s.length();
    }

    public static void main(String[] args) {
        // Example inputs
        String s = "ace";
        String t = "abcde";

        // Check if s is a subsequence of t
        boolean result = isSubsequence(s, t);
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\"? " + result);
    }
}
