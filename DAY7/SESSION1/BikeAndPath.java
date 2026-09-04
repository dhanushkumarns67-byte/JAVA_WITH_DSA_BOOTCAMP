package DAY7.SESSION1;

import java.util.*;

public class BikeAndPath {

    static boolean findingPath(List<List<Integer>> maze, int x, int y, String path) {

        int N = maze.size();

        if (x == N - 1 && y == N - 1) {
            System.out.println(path);
            return true;
        }

        if (x >= N || y >= N || maze.get(x).get(y) == 0)
            return false;

        // Mark
        maze.get(x).set(y, 0);

        // Down
        if (findingPath(maze, x + 1, y, path + "D"))
            return true;

        // Right
        if (findingPath(maze, x, y + 1, path + "R"))
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

        findingPath(maze, 0, 0, "");
    }
}