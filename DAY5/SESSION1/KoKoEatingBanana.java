package DAY5.SESSION1;

public class KoKoEatingBanana {
    public static void main(String[] args) {
        int[] bunches = {3, 6, 7, 11};
        int hours = 8;

        System.out.println(speedofEating(bunches, hours));
    }

    public static int speedofEating(int[] bunches, int h) {
        int left = 1;
        int right = 0;
        for (int bunch : bunches) {
            right = Math.max(right, bunch);
        }
        int answer = right;
        while (left <= right) {
            // int mid = (left + right) / 2; // This can cause overflow
            int mid = (left + (right - left) / 2);
            long totalHours = 0;
            for (int bunch :  bunches) {
                totalHours += (bunch + mid - 1L) / mid;
                // distance / speed
            }
            if (totalHours <= h) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}