package DAY8.SESSION3;

import java.util.Arrays;

public class SingleNumber3 {
    public static int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int distinguishingBit = xor & -xor;
        int first = 0;
        int second = 0;

        for (int num : nums) {
            if ((num & distinguishingBit) == 0) {
                first ^= num;
            } else {
                second ^= num;
            }
        }

        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int[] result = singleNumber(new int[]{-1,0});
        System.out.println(Arrays.toString(result));
    }
}
