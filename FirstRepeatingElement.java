// Given an array arr[], find the first repeating element. The element should occur more than once
// and the index of its first occurrence should be the smallest.

// Note:- The position you return should be according to 1-based indexing. 

import java.util.HashMap;

public class FirstRepeatingElement {
    public static int findFirstRepeating(int[] arr) {
        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // First pass: Count the frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Second pass: Find the first element with frequency > 1
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) {
                return i + 1; // Return 1-based index
            }
        }

        return -1; // If no repeating element is found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 5, 6};
        System.out.println("First Repeating Element Index: " + findFirstRepeating(arr1)); // Output: 3

        int[] arr2 = {10, 20, 20, 10, 30, 40, 10};
        System.out.println("First Repeating Element Index: " + findFirstRepeating(arr2)); // Output: 1

        int[] arr3 = {5, 10, 15, 20};
        System.out.println("First Repeating Element Index: " + findFirstRepeating(arr3)); // Output: -1
    }
}
