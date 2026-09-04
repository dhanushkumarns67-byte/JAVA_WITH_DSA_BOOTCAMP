package DAY5.SESSION2;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    // Find first occurrence
    public static int findFirst(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int first = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return first;
    }

    // Find last occurrence
    public static int findLast(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int last = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return last;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        int[] result = {first, last};

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Starting and ending position: "
                + Arrays.toString(result));
    }
}
