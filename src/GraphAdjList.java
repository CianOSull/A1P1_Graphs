
import java.util.LinkedList;
import java.util.Iterator;

	/**
	* Graph implementation that uses Adjacency Lists to store edges. It
	* contains one linked-list for every vertex i of the graph. The list for i
	* contains one instance of VertexAdjList for every vertex that is adjacent to i.
	* For directed graphs, if there is an edge from vertex i to vertex j then there is
	* a corresponding element in the adjacency list of node i (only). For
	* undirected graphs, if there is an edge between vertex i and vertex j, then there is a
	* corresponding element in the adjacency lists of *both* vertex i and vertex j. The
	* edges are not sorted; they contain the adjacent nodes in *order* of
	* edge insertion. In other words, for a graph, the node at the head of
	* the list of some vertex i corresponds to the edge involving i that was
	* added to the graph least recently (and has not been removed, yet). 
	*/

	public class GraphAdjList  implements Graph {

	// ATTRIBUTES: 
	    
	 //TO-DO
		private LinkedList<Edge>[] square;
		boolean isDirected;
		int numOfEdges;
	 /*
	  * CONSTRUCTOR: Creates a directed/undirected graph with V vertices and no edges.
	  * It initializes the array of adjacency edges so that each list is empty.
	  */
	    
	 public GraphAdjList(int V, boolean directed) {	     
	    //TO-DO
		 this.square = new LinkedList[V];
	     for (int i = 0; i < V; i++) {
	    	 square[i] = new LinkedList<Edge>();
	     }
	     this.isDirected = directed;
	     this.numOfEdges = 0;
	 }

	 
	  // 1. IMPLEMENTATION METHOD numVerts: 
	  public int numVerts() {
	    //TO-DO
		  return square.length;
     
     }

	  // 2. IMPLEMENTATION METHOD numEdges:
	  public int numEdges() {
	    //TO-DO}
		  return numOfEdges;
	  }
	    
	  //  3. IMPLEMENTATION METHOD addEdge:
	  public void addEdge(int v1, int v2, int w) {
	    //TO-DO
		 Edge newEdge = new Edge(v2, w);
		 boolean notInList = true;
		 if(square.length == w) {
			 System.out.println("Index is not a vertex");
		 }
		 else if(isDirected) {
			 if(square[v1].size() != 0) {
				 for(int i = 0; i < square[v1].size(); i++) {
					 if(square[v1].get(i).getVertex() == v2) {
						 square[v1].get(i).setWeight(w);
						 notInList = false;
					 }
				 }
				 if(notInList) {
					 square[v1].add(newEdge);
					 numOfEdges++;
				 }
			 }
			 else {
				 square[v1].add(newEdge);
				 numOfEdges++;
			 }
		 }
		 else {
			 if(square[v1].size() != 0) {
				 for(int i = 0; i < square[v1].size(); i++) {
					 if(square[v1].get(i).getVertex() == v2) {
						 square[v1].get(i).setWeight(w);
						 for(int j = 0; j < square[v2].size(); j++) {
							 if(square[v2].get(j).getVertex() == v1) {
								 square[v2].get(j).setWeight(w);
							 }
						 }
						 notInList = false;
					 }
				 }
				 if(notInList) {
					 square[v1].add(newEdge);
					 newEdge = new Edge(v1, w);
					 square[v2].add(newEdge);
					 numOfEdges++;
				 }
			 }
			 else {
				 square[v1].add(newEdge);
				 newEdge = new Edge(v1, w);
				 square[v2].add(newEdge); 
				 numOfEdges++;
			 }
		 } 
    }
	  
	 // 4. IMPLEMENTATION METHOD removeEdge: 
	 public void removeEdge(int v1, int v2) {
		//TO-DO
		 if(square.length <= v1) {
			 System.out.println("That index is not in the graph");
		 }
		 else if(isDirected) {
			 for(int i = 0; i < square[v1].size(); i++) {
				 if(square[v1].get(i).getVertex() == v2) {
					square[v1].remove(i); 
					numOfEdges--;
				 }
		 	}
		 }
		 else {
			 for(int i = 0; i < square[v1].size(); i++) {
				 if(square[v1].get(i).getVertex() == v2) {
					square[v1].remove(i);
					square[v2].remove(i);
					numOfEdges--;
				 }
			 }
		 }
	 }
	 
	 // 5. IMPLEMENTATION METHOD hasEdge:
	 public boolean hasEdge(int v1, int v2) {
		 //TO-DO
		 boolean res = false;
		 for(int i = 0; i < square[v1].size(); i++) {
			 if(square[v1].get(i).getVertex() == v2) {
				res = true;
			 }
	 	}
		return res;
	 }

	// 6. IMPLEMENTATION METHOD getWeightEdge:
	 public int getWeightEdge(int v1, int v2) {
	    //TO-DO
		 int res = -1;
		 for(int i = 0; i < square[v1].size(); i++) {
			 if(square[v1].get(i).getVertex() == v2) {
				res = square[v1].get(i).getWeight();
			 }
	 	}
		return res;
	 }

	// 7. IMPLEMENTATION METHOD getNeighbors:
	 public LinkedList getNeighbors(int v) {
	     //TO-DO
		 LinkedList<Edge> neighbours = new LinkedList<Edge>();
		 for(int i = 0; i < square[v].size(); i++) {
			 neighbours.add(square[v].get(i));	 
		 }
		 return neighbours;
	 }

    // 8. IMPLEMENTATION METHOD getDegree:
	public int getDegree(int v) {
		//TO-DO
		return square[v].size();
	}

	// 9. IMPLEMENTATION METHOD toString:
	 public String toString() {
		 //TO-DO
	     String graph = "The indexes are: ";
	     // Check System.out.print(square[row]) later
	     for (int row = 0; row < square.length; row++){
			for (int col = 0; col < square[row].size(); col++){
				graph += row + ": " + square[row].get(col).toString() + " ";
	       }
	     }
		 return graph;
	 }
}
