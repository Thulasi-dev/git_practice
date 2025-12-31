/* Given an array and an integer k, find the maximum sum of any contiguous subarray of size k.

✅ Optimal Solution – Fixed Size Sliding Window
⏱ Time Complexity: O(n)
💾 Space Complexity: O(1)

🧠 Logic (Interview Explanation)
First, calculate the sum of the first k elements
Slide the window:
  Add the next element
  Remove the element going out of the window
Keep track of the maximum sum
Each element is added once and removed once → O(n) */

public class MaxSumSubarrayK {
    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) {
            throw new IllegalArgumentException("Window size k is larger than array size");
        }

        int windowSum = 0;
        int maxSum = 0;

        // Step 1: Sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];        // add next element
            windowSum -= arr[i - k];    // remove left element
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3; // 5+1+3=9

        System.out.println(maxSum(arr, k)); // Output: 9
    }
}
