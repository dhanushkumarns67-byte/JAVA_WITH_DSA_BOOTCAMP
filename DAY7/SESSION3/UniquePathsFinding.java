package DAY7.SESSION3;

public class UniquePathsFinding {

    public static int uniquePathsFinding(int m, int n) {

        int[][] dp = new int[m][n];

        // Base case: first row
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Base case: first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // DP: from top + from left
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 2;

        System.out.println("Unique Paths: " + uniquePathsFinding(m, n));
    }
}