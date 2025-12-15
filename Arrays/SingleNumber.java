// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;

        // XOR all the numbers in the array
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {4, 1, 2, 1, 2};

        // Call the method and print the result
        int single = singleNumber(nums);
        System.out.println("The single number is: " + single);
    }
}

// Input: nums = [4,1,2,1,2]

// Output: 4
