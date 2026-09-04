package DAY12.SESSION1;

public class webGraph {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };

        int hyperlinkCount = 0;
        for (int[] row : graph) {
            for (int value : row) {
                hyperlinkCount += value;
            }
        }

        System.out.println("Number of web pages: " + graph.length);
        System.out.println("Number of hyperlinks: " + hyperlinkCount);
    }
}