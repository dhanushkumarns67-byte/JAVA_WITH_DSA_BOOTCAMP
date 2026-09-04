package DAY9.SESSION1;

public class TrappingRainWater {

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {

            if (height[left] <= height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }

                left++;

            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {

        // Test case
        int[] height = {
            0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
        };

        // Create object
        TrappingRainWater obj = new TrappingRainWater();

        // Call method
        int result = obj.trap(height);

        // Print result
        System.out.println("Trapped Rain Water = " + result);
    }
}
