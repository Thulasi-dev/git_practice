// Repeated DNA Sequences

/* The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

 */

import java.util.*;

class FindRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> seen = new HashSet<>();      // stores all 10-letter substrings seen
        Set<String> repeated = new HashSet<>(); // stores only repeated ones

        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);

            // If already seen, it is repeated
            if (seen.contains(sub)) {
                repeated.add(sub);
            } 
            // Otherwise, add it to seen set
            else {
                seen.add(sub);
            }
        }

        // Convert Set to List for final answer
        return new ArrayList<>(repeated);
    }
}


Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
