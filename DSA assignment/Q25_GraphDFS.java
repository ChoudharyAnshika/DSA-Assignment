import java.util.*;

public class Q25_GraphDFS {
    int vertices;
    LinkedList<Integer>[] adjacencyList;

    @SuppressWarnings("unchecked")
    Q25_GraphDFS(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        adjacencyList[u].add(v);
    }

    void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS: ");
        dfsRec(startVertex, visited);
        System.out.println();
    }

    void dfsRec(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList[vertex]) {
            if (!visited[neighbor]) {
                dfsRec(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Q25_GraphDFS graph = new Q25_GraphDFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        graph.dfs(0);
    }
}