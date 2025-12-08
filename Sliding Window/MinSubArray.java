// Minimum Size Subarray Sum

// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray 
// whose sum is greater than or equal to target. If there is no such subarray, return 0 instead

class MinSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;          // Left pointer of sliding window
        int sum = 0;           // Current window sum
        int minLength = Integer.MAX_VALUE;  // Stores minimum length

        // Move right pointer through the array
        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];   // Add current element to sum

            // Shrink the window while sum >= target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];  // Remove left element
                left++;             // Move left pointer
            }
        }

        // If no valid subarray found, return 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

/*
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint. */
