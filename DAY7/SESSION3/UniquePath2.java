package DAY7.SESSION3;

public class UniquePath2 {

    public static int uniquepathwithobstacle(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        // Starting cell is an obstacle
        if (grid[0][0] == 1) {
            return 0;
        }

        dp[0][0] = 1;

        // First row
        for (int i = 1; i < n; i++) {
            if (grid[0][i] == 0) {
                dp[0][i] = dp[0][i - 1];
            }
        }

        // First column
        for (int i = 1; i < m; i++) {
            if (grid[i][0] == 0) {
                dp[i][0] = dp[i - 1][0];
            }
        }

        // Remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
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