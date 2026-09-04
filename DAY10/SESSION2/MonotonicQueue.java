package DAY10.SESSION2;

import java.util.*;

public class MonotonicQueue {
    public static void main(String[] args) {
        int[] nums = {3,1,5,2,4};
        Deque<Integer> queue = new ArrayDeque<>();
        for(int num : nums){
            while(!queue.isEmpty() && queue.peekLast() < num){
                queue.pollLast();
            }
            queue.offerLast(num);
        }
        System.out.println(queue);
}
}