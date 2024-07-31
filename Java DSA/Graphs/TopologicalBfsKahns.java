import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
// import java.util.Queue;

public class TopologicalBfsKahns {
    
    static class Edge{

        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }


    static void createGraph(ArrayList<Edge> graph []){

        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    static void calcInDeg(ArrayList<Edge> graph[], int InDeg[]){

        for(int i = 0; i<graph.length; i++){

            int v = i; //v = vertex

            for(int j = 0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                InDeg[e.dest]++;
            }
        }
    }

    static void topSort(ArrayList<Edge> graph[]){

        int inDeg[] = new int [graph.length];
        calcInDeg(graph,inDeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<inDeg.length; i++){ // here we are adding the elements whose inDeg is already zero
            if(inDeg[i] == 0){
                q.add(i);
            }
        }

        //bfs

        while(!q.isEmpty()){

            int curr = q.remove();
            System.out.print(curr+" ");

            for( int i = 0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);

                inDeg[e.dest]--;

                if(inDeg[e.dest] == 0){
                    q.add(e.dest);
                }

            }
        }

        System.out.println();
    }

    public static void main(String args[]){

        int V = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topSort(graph);

    }
}