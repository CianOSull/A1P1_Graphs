import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.corba.se.impl.orbutil.graph.NodeData;

/*
 *  Implementation of the interface Graph with adjacency matrix.
*/

public class GraphAdjMatrix implements Graph, com.sun.corba.se.impl.orbutil.graph.Graph{

	// ATTRIBUTES: 
    //TO-DO
	private int[][] square;
	private boolean typeOfGraph;
    private int numOfEdges;
	
    // CONSTRUCTOR: Creates a directed/undirected graph with V vertices and no edges
    public GraphAdjMatrix(int V, boolean directed) {
    //TO-DO
    	this.square = new int[V][V];
    	for (int row = 0; row < square.length; row++){
	        for (int col = 0; col < square.length; col++){
	        	square[row][col] = -1;
	        }
		}
    	this.typeOfGraph = directed;
    	this.numOfEdges = 0;
    }


    // 1. IMPLEMENTATION METHOD numVerts: 
    public int numVerts() {
    	int res;
    	res = square[0].length;
		return res; 
    //TO-DO
    }
    
   
    // 2. IMPLEMENTATION METHOD numEdges:
    public int numEdges() { 
        //TO-DO
	     	return numOfEdges;
        }

    //THE ELSES MIGHT NOT BE NEEDED ANYMORE
   //  3. IMPLEMENTATION METHOD addEdge:
    public void addEdge(int v1, int v2, int w) {
        //TO-DO
    	if(square.length <= v1 || square.length <= v2) {
    		System.out.print("That index is not in the graph");
    	}
    	else if(typeOfGraph) {
    		if(square[v1][v2] == -1) {
	    		square[v1][v2] = w;
	    		numOfEdges++;
    		}
    		else {
    			square[v1][v2] = w;
    		}
    	}
    	else {
    		if(square[v1][v2] == -1) {
	    		square[v1][v2] = w;
	    		square[v2][v1] = w;
	    		numOfEdges++;
    		}
    		else {
    			square[v1][v2] = w;
    			square[v2][v1] = w;
    		}
    	}
    }
    
   // 4. IMPLEMENTATION METHOD removeEdge:
   public void removeEdge (int v1, int v2)
   {
	    //TO-DO
		if(square.length == v1 || square.length == v2) {
	   		System.out.print("That index is not in the graph");
	   	}
	   	else if(typeOfGraph) {
	   			square[v1][v2] = -1;
	   			numOfEdges--;
	   	}
	   	else {
	    	square[v1][v2] = -1;
	    	square[v2][v1] = -1;
	    	numOfEdges--;
	   	}
   }

    // 5. IMPLEMENTATION METHOD hasEdge:
    public boolean hasEdge(int v1, int v2) {
        //TO-DO
    	boolean res;
    	if(square[v1][v2] == -1) {
    		res = false;
    	}
    	else {
    		res = true;
    	}
		return res;
    }
    
    // 6. IMPLEMENTATION METHOD getWeightEdge:
	public int getWeightEdge(int v1, int v2) {
		//TO-DO
		return square[v1][v2];
	}

    
	// 7. IMPLEMENTATION METHOD getNeighbors:
	public LinkedList getNeighbors(int v)
	{
    	//TO-DO
		LinkedList<Integer> neighbours = new LinkedList<Integer>();
		for(int i = 0; i < square.length; i++) {
			if(square[v][i] != -1) {
				neighbours.add(i);
			}
		}
		
		return neighbours;
	}
   	
	// 8. IMPLEMENTATION METHOD getDegree:
	public int getDegree(int v) 
	{
	   //TO-DO
		int res = 0;
        for (int col = 0; col < square.length; col++){
            if(square[v][col] != -1) {
            	res++;
            }
		}
        
        // if it is an undirected graph then divide the amount of edges by 2
        if(typeOfGraph == false) {
        	res /= 2;
        }
        
        return res;
	}
	

	// 9. IMPLEMENTATION METHOD toString:
   	public String toString()
    {
    //TO-DO
		String squareString = "";
   		for (int row = 0; row < square.length; row++){
	        for (int col = 0; col < square.length; col++){
	          squareString += square[row][col] + " ";
	        }
	        squareString += "\n";
		}
   		return squareString;
    }


	@Override
	public boolean add(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public NodeData getNodeData(Node arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set getRoots() {
		// TODO Auto-generated method stub
		return null;
	}
}