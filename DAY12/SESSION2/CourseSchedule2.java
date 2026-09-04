package DAY12.SESSION2;

import java.util.*;

public class CourseSchedule2 {
    static class Solution {
    @SuppressWarnings("unchecked")
    public int[] findOrder(int n, int[][] p) {
        List<Integer>[] g = (List<Integer>[]) new ArrayList[n];
        int[] in = new int[n];

        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();

        for (int[] x : p) {
            g[x[1]].add(x[0]);
            in[x[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            if (in[i] == 0) q.add(i);

        int[] ans = new int[n];
        int k = 0;

        while (!q.isEmpty()) {
            int u = q.poll();
            ans[k++] = u;

            for (int v : g[u])
                if (--in[v] == 0) q.add(v);
        }

        return k == n ? ans : new int[0];
    }
}
public static void main(String[] args) {
        int[][] prerequisites = {
                {1, 0},
                {2, 1},
                {3, 2}
        };

        int numCourses = 4;
        Solution solution = new Solution();
        int[] order = solution.findOrder(numCourses, prerequisites);

        if (order.length == 0) {
            System.out.println("No valid course order exists.");
        } else {
            System.out.print("Valid course order: ");
            for (int course : order) {
                System.out.print(course + " ");
            }
            System.out.println();
        }
    }
}
