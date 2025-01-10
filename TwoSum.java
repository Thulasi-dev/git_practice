// Given an array arr[] of positive integers and another integer target. 
// Determine if there exists two distinct indices such that the sum of there elements is equals to target.

import java.util.HashMap;

public class TwoSum {
    public static boolean hasTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // Check if the complement exists in the map and the indices are distinct
            if (map.containsKey(complement) && map.get(complement) != i) {
                return true; // A pair exists
            }

            // Store the current element with its index
            map.put(arr[i], i);
        }

        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Exists: " + hasTwoSum(arr, target)); // Output: true

        int[] arr2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Exists: " + hasTwoSum(arr2, target2)); // Output: true

        int[] arr3 = {1, 2, 3};
        int target3 = 7;
        System.out.println("Exists: " + hasTwoSum(arr3, target3)); // Output: false
    }
}
