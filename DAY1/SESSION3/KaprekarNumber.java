package DAY1.SESSION3;

public class KaprekarNumber {
    public static void main(String[] args) {

        int n = 25;
        int square = n * n;

        String str = String.valueOf(square);
        int len = str.length();
        boolean found = false;

        for (int i = 1; i < len; i++) {

            String leftPart = str.substring(0, i);
            String rightPart = str.substring(i);

            int left = Integer.parseInt(leftPart);
            int right = Integer.parseInt(rightPart);

            if (left + right == n) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Kaprekar");
        } else {
            System.out.println("Not Kaprekar");
        }
    }
}