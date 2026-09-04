package HomeWork;

import java.util.*;

public class BikeAndPath {

    static boolean findingPath(List<List<Integer>> maze, int x, int y, String path) {

        int N = maze.size();

        // Destination
        if (x == 0 && y == 0) {
            System.out.println(path);
            return true;
        }

        // Boundary / blocked cell
        if (x < 0 || y < 0 || x >= N || y >= N || maze.get(x).get(y) == 0)
            return false;

        // Mark
        maze.get(x).set(y, 0);

        // Up
        if (findingPath(maze, x - 1, y, path + "U"))
            return true;

        // Left
        if (findingPath(maze, x, y - 1, path + "L"))
            return true;

        // Unmark
        maze.get(x).set(y, 1);

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        List<List<Integer>> maze = new ArrayList<>();

        for (int[] row : matrix) {
            maze.add(new ArrayList<>(Arrays.stream(row).boxed().toList()));
        }

        // Start from bottom-right
        findingPath(maze, 3, 3, "");
    }
}
