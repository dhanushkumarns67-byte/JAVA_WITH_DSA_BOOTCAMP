package DAY13.SESSION1;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int c = nums[i];

            if (c < nums.length && nums[i] != nums[c]) {
                int t = nums[i];
                nums[i] = nums[c];
                nums[c] = t;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++)
            if (nums[i] != i)
                return i;

        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(new MissingNumber().missingNumber(nums));
    }
}

