// Rearrange array in alternating positive and negative

/*✅ Case 1: Equal number of positives & negatives
🔥 Optimal In-Place Solution
⏱ Time: O(n)
💾 Space: O(1)

💡 Idea
Positives at even index
Negatives at odd index*/

public class RearrangeAlternate {
    public static void rearrange(int[] arr) {
        int posIndex = 0; // even index
        int negIndex = 1; // odd index
        int n = arr.length;

        while (posIndex < n && negIndex < n) {
            if (arr[posIndex] >= 0) {
                posIndex += 2;
            } else if (arr[negIndex] < 0) {
                negIndex += 2;
            } else {
                // swap
                int temp = arr[posIndex];
                arr[posIndex] = arr[negIndex];
                arr[negIndex] = temp;

                posIndex += 2;
                negIndex += 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        rearrange(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

output:
1 -2 3 -4 5 -6
