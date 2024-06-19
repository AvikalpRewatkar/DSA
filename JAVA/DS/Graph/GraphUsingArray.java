package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphUsingArray {

    static int time = 0;
    static int color[];
    static int parent[];
    static double distance[];
    static int discovery[];
    static int finish[];

    public static void main(String[] args) {

        int[][] graph1 = {
                { 0, 1, 0, 1, 1, 0 },
                { 1, 0, 1, 0, 0, 1 },
                { 0, 1, 0, 0, 1, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 0 }
        };
        int graph2[][] = {
                { 0, 1, 1, 1, 0, 0, 0 },
                { 1, 0, 0, 0, 1, 0, 0 },
                { 1, 0, 0, 0, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 0 },
                { 0, 1, 1, 0, 0, 0, 1 },
                { 0, 0, 1, 1, 0, 0, 1, },
                { 0, 0, 0, 0, 1, 1, 0 }
        };

        bfs(graph1);
        bfs(graph2);

    }

    // BFS Algo
    private static void bfs(int[][] graph) {
        int noOfNodes = graph.length;

        // colour[i] = -1 (unvisited) (white)
        // 0 (exploring...) (grey)
        // 1 (explored) (black)
        color = new int[noOfNodes];

        // distance[i] = defines distance of node from source
        distance = new double[noOfNodes];

        // parent[i] = -1 (no parent), otherwise, parent node index
        parent = new int[noOfNodes];

        int source = 0;

        // Need Queue Data structure
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < noOfNodes; i++) {
            color[i] = -1;
            distance[i] = Double.POSITIVE_INFINITY;
            parent[i] = -1;
        }

        color[source] = 0;
        distance[source] = 0;

        // Checking if colour distance parent are initialized properly.

        // for (int i = 0; i < noOfNodes; i++) {
        // System.out.print(colour[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < noOfNodes; i++) {
        // System.out.print(distance[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < noOfNodes; i++) {
        // System.out.print(parent[i] + " ");
        // }
        // System.out.println();

        q.add(source);
        // System.out.println(q.peek());

        while (!q.isEmpty()) {
            int u = (int) q.peek();
            System.out.print(u + " ");

            for (int i = 0; i < noOfNodes; i++) {
                if (graph[u][i] == 1) {
                    if (color[i] == -1) {
                        color[i] = 0;
                        distance[i] = distance[u] + 1;
                        parent[i] = u;
                        q.add(i);
                    }
                }
            }
            q.remove();
            color[u] = 1;
        }
    }

    // DFS Algo
    static void dfs(int graph[][]) {
        int noOfNodes = graph.length;
        color = new int[noOfNodes];
        parent = new int[noOfNodes];
        discovery = new int[noOfNodes];
        finish = new int[noOfNodes];

        color[0] = -1;
        parent[0] = -1;
        for (int i = 1; i < noOfNodes; i++) {
            color[i] = -1;
            parent[i] = -1;
        }
        time = 0;
        for (int u = 0; u < noOfNodes; u++) {
            if (color[u] == -1) {
                dfs_visit(graph, noOfNodes, color, parent, discovery, finish, u);
            }
        }

        System.out.println("Color: ");
        for (int i = 0; i < noOfNodes; i++) {
            System.out.print(color[i] + " ");
        }
        System.out.println();

        System.out.println("Parent: ");
        for (int i = 0; i < noOfNodes; i++) {
            System.out.print(parent[i] + " ");
        }
        System.out.println();

        System.out.println("Discovery time: ");
        for (int i = 0; i < noOfNodes; i++) {
            System.out.print(discovery[i] + " ");
        }
        System.out.println();

        System.out.println("Finish Time: ");
        for (int i = 0; i < noOfNodes; i++) {
            System.out.print(finish[i] + " ");
        }
        System.out.println();
    }

    private static void dfs_visit(int[][] graph, int noOfNodes, int[] color, int[] parent, int[] discovery,
            int finish[], int u) {
        color[u] = 0;
        time++;
        discovery[u] = time;

        for (int v = 0; v < noOfNodes; v++) {
            if (graph[u][v] == 0) {
                continue;
            }
            if (color[v] == -1) {
                parent[v] = u;
                dfs_visit(graph, noOfNodes, color, parent, discovery, finish, v);
            }
        }
        color[u] = 1;
        time++;
        finish[u] = time;
    }

    // Create Graph
    // Problem: not able to read sc.nextLine()
    static int[][] makeGraph() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Nodes?");
        int noOfNodes = sc.nextInt();
        int[][] graph = new int[noOfNodes][noOfNodes];

        String wantMoreEdge = "N";
        System.out.println("Edges?");
        wantMoreEdge = sc.nextLine();
        while (wantMoreEdge == "Y") {
            System.out.print("From: ");
            int from = sc.nextInt();
            System.out.print("To: ");
            int to = sc.nextInt();
            addEdge(graph, from, to);

            System.out.println("Want more edge?");
            wantMoreEdge = sc.nextLine();
        }

        // display all edges
        for (int i = 0; i < noOfNodes; i++) {
            for (int j = 0; j < noOfNodes; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
        return graph;
    }

    // used to add edges
    static void addEdge(int graph[][], int from, int to) {
        if (graph[from][to] == 1) {
            return;
        }
        graph[from][to] = 1;
        graph[to][from] = 1;
    }
}
