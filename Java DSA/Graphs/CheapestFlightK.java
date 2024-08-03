import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightK {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(int flights[][], ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] flight : flights) {
            int src = flight[0];
            int dst = flight[1];
            int wt = flight[2];
            Edge e = new Edge(src, dst, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int v; // vertex
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int n, int flights[][], int src, int dest, int k) {

        // creating graph
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        // intialing all dist by infinity in dist array
        int dist[] = new int[n];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0)); // start
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stops > k) {
                break;
            }

            for (int i = 0; i < graph[curr.v].size(); i++) {

                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                // relaxation
                if (dist[u] != Integer.MAX_VALUE && curr.cost + wt <= dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }

        }

        if (dist[dest] == Integer.MAX_VALUE)
            return -1;

        else
            return dist[dest];

    }

    public static void main(String args[]) {
        int n = 4;
        int flights[][] = { { 0, 1, 100 },
                { 1, 2, 100 },
                { 2, 0, 100 },
                { 1, 3, 600 },
                { 2, 3, 200 } };
        int src = 0, dst = 3, k = 1;

        System.out.print(cheapestFlight(n, flights, src, dst, k));
    }
}