// Permutation in String

// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
// In other words, return true if one of s1's permutations is the substring of s2.

class Permutation {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26]; // frequency of s1
        int[] count2 = new int[26]; // frequency of current window in s2

        // Count frequency of s1
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        int windowSize = s1.length();

        // Initialize the first window
        for (int i = 0; i < windowSize; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        // Check the first window
        if (matches(count1, count2)) return true;

        // Slide the window
        for (int i = windowSize; i < s2.length(); i++) {
            // Add new char to window
            count2[s2.charAt(i) - 'a']++;
            // Remove leftmost char from window
            count2[s2.charAt(i - windowSize) - 'a']--;
            // Check if current window matches
            if (matches(count1, count2)) return true;
        }

        return false;
    }

    // Helper function to compare frequency arrays
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}

/* Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

Input: s1 = "ab", s2 = "eidboaoo"
Output: false */
