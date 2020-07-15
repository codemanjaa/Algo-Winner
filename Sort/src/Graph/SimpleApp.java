package Graph;

public class SimpleApp {

    public static void main(String[] args) {
        System.out.println("This is a simple graph sample");
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3);

       Object obj[] = graph.adjacent(0);

       for(int i=0; i<obj.length; i++){
           System.out.print(obj[i].toString() + "---->");
       }


    }
}
