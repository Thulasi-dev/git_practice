// Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest substring without duplicate characters

import java.util.*;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>(); // stores unique characters
        int left = 0;   // left pointer of window
        int maxLen = 0; // stores maximum length

        for (int right = 0; right < s.length(); right++) {

            // If duplicate found, remove from left until it's gone
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}


Input: s = "abcabcbb"
Output: 3
