package DAY12.SESSION1;

public class Leetcode1971 {

    public boolean checkPath(int n, int[][] edges, int src, int dest) {

        boolean[][] graph = new boolean[n][n];


        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            // Undirected graph
            graph[u][v] = true;
            graph[v][u] = true;
        }
        boolean[] visited = new boolean[n];

        return dfs(graph, src, dest, visited);
    }

    public boolean dfs(boolean[][] graph,
                int current,
                int dest,
                boolean[] visited) {

        if (current == dest) {
            return true;
        }

        visited[current] = true;

        for (int nbr = 0; nbr < graph.length; nbr++) {

            // If there is an edge and neighbor is not visited
            if (graph[current][nbr] && !visited[nbr]) {

                if (dfs(graph, nbr, dest, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Leetcode1971 obj = new Leetcode1971();

        int n = 3;

        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 2}
        };

        int src = 0;
        int dest = 2;

        System.out.println(obj.checkPath(n, edges, src, dest));
    }
}