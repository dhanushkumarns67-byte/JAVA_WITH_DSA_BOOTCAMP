package DAY12.SESSION2;

import java.util.*;
public class CourseShecdule {
    public static boolean checkCycle(int n, int[][] pre){
        //create graph
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        // Add values
        for(int[] p : pre){
            int course = p[0];
            int prev = p[1];
            graph.get(prev).add(course);
        }

        int[] state = new int[n];
        for (int course = 0; course < n; course++) {
            if (hasCycle(course, graph, state)) {
                return false;
            }
        }
        return true;
    } 

    private static boolean hasCycle(int course, List<List<Integer>> graph, int[] state) {
        if (state[course] == 1) {
            return true;
        }
        if (state[course] == 2) {
            return false;
        }

        state[course] = 1;
        for (int next : graph.get(course)) {
            if (hasCycle(next, graph, state)) {
                return true;
            }
        }
        state[course] = 2;
        return false;
    }

    public static void main(String[] args) {
        int[][] prerequisites = {
                {1, 0},
                {2, 1},
                {3, 2}
        };

        int numCourses = 4;
        boolean canFinish = checkCycle(numCourses, prerequisites);
        System.out.println("Can finish all courses: " + canFinish);
    }
    
}