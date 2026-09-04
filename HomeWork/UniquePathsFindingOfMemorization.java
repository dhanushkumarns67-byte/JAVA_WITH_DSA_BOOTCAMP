package HomeWork;

import java.util.Arrays;

public class UniquePathsFindingOfMemorization {

    public static int uniquePathsFinding(int m, int n) {

        int[][] dp = new int[m][n];

        // Fill dp with -1
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(m - 1, n - 1, dp);
    }

    public static int solve(int i, int j, int[][] dp) {

        // Base case: reached starting cell
        if (i == 0 && j == 0) {
            return 1;
        }

        // Outside the grid
        if (i < 0 || j < 0) {
            return 0;
        }

        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Move up
        int up = solve(i - 1, j, dp);

        // Move left
        int left = solve(i, j - 1, dp);

        // Store result
        dp[i][j] = up + left;

        return dp[i][j];
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 2;

        System.out.println("Unique Paths: " + uniquePathsFinding(m, n));
    }
}
