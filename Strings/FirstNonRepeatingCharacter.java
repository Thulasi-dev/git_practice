import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String s) {
        // HashMap to store character frequency
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // First pass: Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Second pass: Find the first character with a frequency of 1
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        
        // If no non-repeating character found, return '$'
        return '$';
    }
    
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char result = firstNonRepeating(s);
        if (result == '$') {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
