package Graph;

import java.util.ArrayList;

public class Graph {

    private ArrayList[] graph;
    private int vertexSize;
    private int edge;

    public Graph(int size){

        this.vertexSize = size;
        graph = new ArrayList[vertexSize];
        edge = 0;

        for(int i=0; i<vertexSize; i++){
            graph[i] = new ArrayList<Integer>();
        }
    }

    public int getVertexSize(){
        return vertexSize;
    }

    public void addEdge(int src, int dest){
        graph[src].add(dest);
        edge++;
    }

    public int getEdge(){
        return edge;
    }

    public Object[] adjacent(int src){
        return graph[src].toArray();
    }
}
