// Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
/* Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size only where distinct elements are present and modify the original array
such that all the distinct elements come at the beginning of the original array. */

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // no elements
        }

        int k = 1; // pointer for the position of next unique element

        for (int i = 1; i < nums.length; i++) {
            // if current element is different from previous, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // place it in the next unique position
                k++; // increment unique count
            }
        }

        return k; // number of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
