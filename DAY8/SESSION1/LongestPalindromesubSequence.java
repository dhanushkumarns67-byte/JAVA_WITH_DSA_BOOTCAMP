package DAY8.SESSION1;

public class LongestPalindromesubSequence {
    public static int longestpalindromesubsequence(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[s.length() + 1][rev.length() + 1];

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= rev.length(); j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[s.length()][rev.length()];
    }
    public static void main(String[] args) {
        System.out.println(longestpalindromesubsequence("babbb"));
    }
    
}
