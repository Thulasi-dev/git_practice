/*✅ Case 2: Unequal positives & negatives (MOST COMMON INTERVIEW CASE)
⏱ Time: O(n)
💾 Space: O(n) */

import java.util.*;

public class RearrangeAlternate2 {
    public static int[] rearrange(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int i = 0, p = 0, n = 0;

        // Start with positive (can mention assumption)
        while (p < pos.size() && n < neg.size()) {
            nums[i++] = pos.get(p++);
            nums[i++] = neg.get(n++);
        }

        // Append remaining elements
        while (p < pos.size()) nums[i++] = pos.get(p++);
        while (n < neg.size()) nums[i++] = neg.get(n++);

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 4};
        rearrange(arr);

        for (int num : arr) {
            System.out.print(num + " "); // 1 -2 3 -4 4 -1
        }
    }
}

/*“If positives and negatives are equal, we can do it in O(1) space.
If counts are unequal and order must be preserved, O(n) extra space is needed.”*/
