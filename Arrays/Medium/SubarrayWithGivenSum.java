/* Find a continuous subarray whose sum equals a given target.

Array  : [1, 4, 20, 3, 10, 5]
Target : 33
Output : Subarray found from index 2 to 4
         [20, 3, 10]
O(n) time, O(1) space

💡 Logic (Interview Explanation)

Use two pointers: start and end
Expand window by adding elements
Shrink window when sum becomes greater than target
Since numbers are positive, shrinking guarantees sum decreases*/

public class SubarrayWithGivenSum {
    public static void findSubarray(int[] arr, int target) {
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            // Shrink window if sum exceeds target
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if sum matches target
            if (currentSum == target) {
                System.out.println("Subarray found from index "
                        + start + " to " + end);
                for(int i=start;i<=end;i++){
                    System.out.print(arr[i]+" ");
                }
                return;
            }
        }

        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        findSubarray(arr, target);
    }
}
