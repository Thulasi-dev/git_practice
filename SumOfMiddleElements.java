//sort the elements in the two arrays and then sum the middle element

public class SumOfMiddleElements {

    public static int findSumOfMiddleElements(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] merged = new int[2 * n];

        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < n && j < n) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // If there are remaining elements in arr1
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // If there are remaining elements in arr2
        while (j < n) {
            merged[k++] = arr2[j++];
        }
        
        //print the merged arrays
        System.out.println("Merged Array");
        for(int num:merged) {
        	System.out.print(num+" ");
        }

        // Middle elements are at positions n-1 and n in the merged array
        int middleSum = merged[n - 1] + merged[n];
        return middleSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 4, 4};
        int[] arr2 = {2, 2, 6, 8}; //1,1,2,2,4,4,6,8

        int sum = findSumOfMiddleElements(arr1, arr2);
        System.out.println("\nSum of middle elements: " + sum); // Output: 6
           
    }
}

