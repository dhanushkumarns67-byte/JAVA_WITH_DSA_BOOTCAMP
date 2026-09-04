package DAY1;

import java.util.Scanner;

public class MinNumberOfNotes {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int amount = sc.nextInt();
            int total = 0, n;

            n = amount / 100; total += n; amount %= 100;
            System.out.println("100 = " + n);

            n = amount / 50; total += n; amount %= 50;
            System.out.println("50 = " + n);

            n = amount / 20; total += n; amount %= 20;
            System.out.println("20 = " + n);

            n = amount / 10; total += n; amount %= 10;
            System.out.println("10 = " + n);

            n = amount / 5; total += n; amount %= 5;
            System.out.println("5 = " + n);

            n = amount / 2; total += n; amount %= 2;
            System.out.println("2 = " + n);

            total += amount;
            System.out.println("1 = " + amount);

            System.out.println("Total = " + total);
        }
    }
}