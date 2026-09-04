package DAY10.SESSION1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SchoolLibraryBookQueueReversal {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        queue.add("Harry Potter");
        queue.add("LOTR");
        queue.add("Narnia");
        queue.add("GoT");
        // Queue → Stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        // Stack → Queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
}