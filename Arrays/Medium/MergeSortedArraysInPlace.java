/* ✅ Case 2: Merge into first array (LeetCode style)
First array has extra space at the end
Time: O(n + m)
Space: O(1) */

public class MergeSortedArraysInPlace {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // last element of nums1
        int j = n - 1;        // last element of nums2
        int k = m + n - 1;    // last index of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining nums2 elements
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);
        // m = 3, Number of valid elements in nums1
        // n = 3, Number of elements in nums2 

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}

/*🧠 Key Idea (WHY merge from back?)

If we merge from the front, we will overwrite useful values in nums1.
So we:
  Compare from the end
  Fill the array from the last index*/
