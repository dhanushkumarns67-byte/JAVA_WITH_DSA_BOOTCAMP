package DAY13.SESSION1;

public class SortColor {
    public static void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length - 1;
        while (m <= h) {
            if (nums[m] == 0) {
                int t = nums[l];
                nums[l++] = nums[m];
                nums[m++] = t;
            } else if (nums[m] == 1) {
                m++;
            } else {
                int t = nums[m];
                nums[m] = nums[h];
                nums[h--] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
