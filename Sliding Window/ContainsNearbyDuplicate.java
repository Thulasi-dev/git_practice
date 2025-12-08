// Contains Duplicate II

// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array 
// such that nums[i] == nums[j] and abs(i - j) <= k.

import java.util.HashMap;

class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // Map to store number and its last index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If number already seen before
            if (map.containsKey(nums[i])) {

                int prevIndex = map.get(nums[i]);

                // Check distance condition
                if (i - prevIndex <= k) {
                    return true;
                }
            }

            // Update latest index of the number
            map.put(nums[i], i);
        }

        // No valid pair found
        return false;
    }
}

/* I used a HashMap to store the last seen index of each element, which allows me to check the index difference 
 in constant time and keep the overall time complexity linear.

 Input: nums = [1,2,3,1], k = 3
 Output: true

 Input: nums = [1,0,1,1], k = 1
 Output: true

 Input: nums = [1,2,3,1,2,3], k = 2
 Output: false */
