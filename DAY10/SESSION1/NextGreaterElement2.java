package DAY10.SESSION1;
import java.util.*;

public class NextGreaterElement2 {
    public static int[] nextGreat(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 2*n; i++){
            int current = nums[i % n];
            while(!stack.isEmpty() && current > nums[stack.peek()]){
                int index = stack.pop();
                result[index] = current;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] result = nextGreat(nums);
        System.out.println(Arrays.toString(result));
    }
    
}
