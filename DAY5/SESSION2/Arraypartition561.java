package DAY5.SESSION2;

public class Arraypartition561 {
    public static int arrayPairSum(int[] nums) {
        // Sort the array
        java.util.Arrays.sort(nums);
        int sum = 0;
        // Sum up every second element starting from the first
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums)); // Output: 4
    }
    
}
