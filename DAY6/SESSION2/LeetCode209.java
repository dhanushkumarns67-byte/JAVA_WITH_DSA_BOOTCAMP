package DAY6.SESSION2;

public class LeetCode209 {
    public static int minSubarraySum(int target,int[] nums){
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0;right<nums.length;right++){
            //
            sum += nums[right];
            if(sum>=target){
                minLen = Math.min(minLen,right - left + 1);

                // shrink
                sum = sum - nums[left];
                left++;
            }

        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubarraySum(target, nums));
    }
    
}
