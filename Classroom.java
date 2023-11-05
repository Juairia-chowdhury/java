import java.util.*;

public class Classroom {
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

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2,10));
        graph[1].add(new Edge(1, 2,3));
        graph[1].add(new Edge(1, 3,42));

        graph[2].add(new Edge(2, 0,11));
        graph[2].add(new Edge(2, 1,33));
        graph[2].add(new Edge(2, 3,44));

        graph[3].add(new Edge(3, 1,20));
        graph[3].add(new Edge(3, 2,10));

    }

    public static void main(String args[]) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " , " +e.wt);
        }

    }

}
