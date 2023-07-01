package com.dsa.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AdjMatrix {

	  private static int adjMatrix[][];
	//  private static int numVertices;

	  // Initialize the matrix
	  public AdjMatrix(int numVertices) {
	 //   numVertices = numVertices;
	    adjMatrix = new int[numVertices][numVertices];
	  }

	  // Add edges
	  public void addEdge(int i, int j) {
	    adjMatrix[i][j] = 1;
	    adjMatrix[j][i] = 1;
	  }
	 
	  // Print the matrix
	  public void printGraph(int numVertices) {
	        System.out.println("Graph: (Adjacency Matrix)");
	        for (int i = 0; i < numVertices; i++) {
	            for (int j = 0; j <numVertices ; j++) {
	                System.out.print(adjMatrix[i][j]+ " ");
	            }
	            System.out.println();
	        }
	        for (int i = 0; i < numVertices; i++) {
	            System.out.print("Vertex " + i + " is connected to:");
	            for (int j = 0; j <numVertices ; j++) {
	                if(adjMatrix[i][j]==1){
	                    System.out.print(j + " ");
	                }
	            }
	            System.out.println();
	        }
	    }

	  public static void main(String args[]) {
		  
		  int numVertices = 3;
		  AdjMatrix g = new AdjMatrix(numVertices);

	    g.addEdge(0, 1);
	    //g.addEdge(0, 2);
	    g.addEdge(1, 2);
	    g.addEdge(2, 0);
	  //  g.addEdge(2, 3);

	   
	    g.printGraph(numVertices);
	    
	    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<numVertices;i++) {
            graph.add(i,new ArrayList<Integer>());
            
        }
        
		/*
		 * for(int i=0;i<adjMatrix.length;i++) {
		 * graph.get(adjMatrix[i][0]).add(adjMatrix[i][1]);
		 * graph.get(adjMatrix[i][1]).add(adjMatrix[i][0]); }
		 */
        
        
        
      //  printGraph(graph);
	   // bfs(graph,numVertices);
	    //converttoList(adjMatrix);
	  }
	  
	  static void printGraph(ArrayList<ArrayList<Integer> > adj)
	    {
	        for (int i = 0; i < adj.size(); i++) {
	            System.out.println("\nAdjacency list of vertex"
	                               + i);
	            System.out.print("head");
	            for (int j = 0; j < adj.get(i).size(); j++) {
	                System.out.print(" -> "
	                                 + adj.get(i).get(j));
	            }
	            System.out.println();
	        }
	    }
	  
	  static void bfs(ArrayList<ArrayList<Integer>> adj, int V) {
			 boolean visited[] = new boolean[V+1];
			
			for(int i=1;i<V;i++) {
				if(visited[i]==false) {
					 bfsRec(adj,i,visited);
				}
			}
			
		 }
		 
		 static void bfsRec(ArrayList<ArrayList<Integer>> adj,int source, boolean visited[]) {
			 
			 visited[source] = true;
			 Queue<Integer> qIn = new LinkedList<>();
			 qIn.add(source);
			 while(qIn.isEmpty()==false) {
				 int u = qIn.poll();
				 System.out.println(u);
				 for(int v:adj.get(u)) {
					 if(!visited[v]) {
						 visited[v] = true;
						 qIn.add(v);
					 }
				 }
			 }
			 
		 }

}
