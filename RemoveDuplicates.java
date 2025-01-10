// Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
/* Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size only where distinct elements are present and modify the original array
such that all the distinct elements come at the beginning of the original array. */

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        // If the array is empty, return 0
        if (arr.length == 0) {
            return 0;
        }

        int k = 1; // Pointer to place the next distinct element
        
        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is different from the previous element
            if (arr[i] != arr[i - 1]) {
                // Place the distinct element at position k
                arr[k] = arr[i];
                // Increment k
                k++;
            }
        }
        
        // Return the size of the modified array with distinct elements
        return k;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2};
        int size1 = removeDuplicates(arr1);
        System.out.println("Size of modified array: " + size1); // Output: 2
        System.out.println("Modified array: " + java.util.Arrays.toString(java.util.Arrays.copyOfRange(arr1, 0, size1))); // Output: [1, 2]

        int[] arr2 = {0, 0, 1, 1, 1, 2, 2};
        int size2 = removeDuplicates(arr2);
        System.out.println("Size of modified array: " + size2); // Output: 3
        System.out.println("Modified array: " + java.util.Arrays.toString(java.util.Arrays.copyOfRange(arr2, 0, size2))); // Output: [0, 1, 2]

        int[] arr3 = {1, 1, 1, 1, 1};
        int size3 = removeDuplicates(arr3);
        System.out.println("Size of modified array: " + size3); // Output: 1
        System.out.println("Modified array: " + java.util.Arrays.toString(java.util.Arrays.copyOfRange(arr3, 0, size3))); // Output: [1]
    }
}
