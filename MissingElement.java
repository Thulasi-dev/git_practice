// Company Tags
// Flipkart    Morgan Stanley    Accolite    Amazon    Microsoft    D-E-Shaw    Ola Cabs   
// Payu    Visa    Intuit    Adobe    Cisco    Qualcomm    TCS

public class MissingElement {
    public static int missingNumber(int arr[]) {
        // The length of the array is n - 1
        int n = arr.length + 1;

        // Calculate the expected sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        // The missing number is the difference between totalSum and arraySum
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        // Example input
        int[] arr = {1, 2, 4, 6, 3, 7, 8}; // Array representing a permutation with one missing element

        // Find and print the missing element
        int missingElement = missingNumber(arr);
        System.out.println("The missing element is: " + missingElement);
    }
}
