package DAY12.SESSION3;

import java.util.Scanner;

public class BudgetShoppigCart {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] prices = new int[n];
            int[] scores = new int[n];

            for (int i = 0; i < n; i++) {
                prices[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                scores[i] = scanner.nextInt();
            }
            int budget = scanner.nextInt();

            int[] dp = new int[budget + 1];

            for (int i = 0; i < prices.length; i++) {
                for (int money = budget; money >= prices[i]; money--) {
                    dp[money] = Math.max(dp[money],
                            dp[money - prices[i]] + scores[i]);
                }
            }

            System.out.println(dp[budget]);
        }
    }
}