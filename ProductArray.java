// Company Tags
// Flipkart    Morgan Stanley    Accolite    Amazon    Microsoft    D-E-Shaw    Intuit    Opera

// Product array puzzle
// Given an array, arr[] construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].

public class ProductArray {
  public static int[] productExceptSelf(int[] arr) {
    int n = arr.length;
    if (n == 0) {
        return new int[0];
    }

    int[] res = new int[n];

    // Step 1: Calculate left products directly in the result array
    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = res[i - 1] * arr[i - 1];
    }

    // Step 2: Calculate right products on the fly and multiply with res
    int right = 1; // Holds the product of elements to the right
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= right; // Multiply current right product with left product
        right *= arr[i]; // Update right product
    }

    return res;
}
}

// Input: arr = {1, 2, 3, 4}
// Output: res = {24, 12, 8, 6}
// For res[0]: 2×3×4=24
// For res[1]: 1×3×4=12
// For res[2]: 1×2×4=8
// For res[3]: 1×2×3=6
