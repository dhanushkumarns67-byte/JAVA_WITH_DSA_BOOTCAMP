package HomeWork;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.add(5);
int k = 3;
Stack<Integer> st = new Stack<>();
for (int i = 0; i < k; i++) {
    st.push(q.poll());
}
while (!st.isEmpty()) {
    q.add(st.pop());
}
System.out.println(q);
    }
}