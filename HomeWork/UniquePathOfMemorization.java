package HomeWork;

import java.util.Arrays;

public class UniquePathOfMemorization {

    public static int uniquepathwithobstacle(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        // Fill dp with -1
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(m - 1, n - 1, grid, dp);
    }

    public static int solve(int i, int j, int[][] grid, int[][] dp) {

        // If cell is outside the grid
        if (i < 0 || j < 0) {
            return 0;
        }

        // If current cell is an obstacle
        if (grid[i][j] == 1) {
            return 0;
        }

        // If we reach starting cell
        if (i == 0 && j == 0) {
            return 1;
        }

        // If already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Move up
        int up = solve(i - 1, j, grid, dp);

        // Move left
        int left = solve(i, j - 1, grid, dp);

        // Store answer
        dp[i][j] = up + left;

        return dp[i][j];
    }

    public static void main(String[] args) {

        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        System.out.println(uniquepathwithobstacle(grid));
    }
}
