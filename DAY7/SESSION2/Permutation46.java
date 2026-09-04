package DAY7.SESSION2;

import java.util.*;

public class Permutation46 {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        backtrack(nums, new ArrayList<>(), result, visited);

        return result;
    }

    private static void backtrack(int[] nums,
                                List<Integer> current,
                                List<List<Integer>> result,
                                boolean[] visited) {

        // 1. BASE CASE
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // 2. TRY ALL UNUSED
        for (int i = 0; i < nums.length; i++) {

            if (visited[i]) {
                continue;
            }

            // 3. CHOOSE
            visited[i] = true;
            current.add(nums[i]);

            // EXPLORE
            backtrack(nums, current, result, visited);

            // 4. UNCHOOSE / BACKTRACK
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println(permute(nums));
    }
}