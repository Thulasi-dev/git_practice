// Given an integer array nums, find the contiguous subarray that has the largest product, and return that product.

/* ✅ Optimal Solution – Dynamic Programming (Kadane-style)
⏱ Time Complexity: O(n)
💾 Space Complexity: O(1) */

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // If current number is negative, swap
            if (current < 0) {
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(current, maxEnding * current);
            minEnding = Math.min(current, minEnding * current);

            maxSoFar = Math.max(maxSoFar, maxEnding);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maxProduct(arr)); // Output: 6
    }
}

// Subarray: [2, 3]
