package DAY10.SESSION1;

import java.util.*;

public class BaseballGame {

    @SuppressWarnings("ConvertToStringSwitch")
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                stack.pop();

            } else if (op.equals("D")) {
                int last = stack.peek();
                stack.push(2 * last);

            } else if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();

                int sum = last + secondLast;
                stack.push(last);
                stack.push(sum);

            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        int total = 0;

        while (!stack.isEmpty()) {
            total += stack.pop();
        }

        return total;
    }

    public static void main(String[] args) {

        String[] operations = {"5", "2", "C", "D", "+"};

        System.out.println("Total Score: " + calPoints(operations));
    }
}