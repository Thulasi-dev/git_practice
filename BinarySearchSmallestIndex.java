// Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.

// Note: If multiple occurrences are there, please return the smallest index.

public class BinarySearchSmallestIndex {
    public static int binarySearch(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int result = -1; // To store the smallest index of k if found

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                result = mid; // Update result
                right = mid - 1; // Move to the left half to find the smallest index
            } else if (arr[mid] < k) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }

        return result; // Return -1 if k is not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int k = 2;
        System.out.println("Position of " + k + ": " + binarySearch(arr, k)); // Output: 1

        int k2 = 6;
        System.out.println("Position of " + k2 + ": " + binarySearch(arr, k2)); // Output: -1
    }
}
