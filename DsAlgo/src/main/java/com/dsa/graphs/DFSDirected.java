package com.dsa.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSDirected {

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v);   //Directed Graph edges
	} 

    static void DFS(ArrayList<ArrayList<Integer>> adj, int u, boolean visited[]) 
    { 	
        visited[u]=true;
        System.out.println(adj.size());
        
        for(int v:adj.get(u)){
            if(visited[v]==false) {
            	visited[v]=true;
                DFS(adj,v,visited);
            }
        }
    }
    
    
    static List<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj, int n) 
    { 
    	boolean[] marked = new boolean[n];
        List<Integer> liInteger = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            if(marked[i]==false) {
              DFS(adj,i,marked);
                liInteger.add(i);
            }
        }
        return liInteger;
       
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

    //convert edges into adjeceny
	/*
	 * ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); for(int i = 0 ; i < n
	 * ; i++) adj.add(new ArrayList<>()); //int[] deg = new int[n];
	 * for(List<Integer> i : edges){ int u = i.get(0); int v = i.get(1);
	 * adj.get(u).add(v); //deg[v]++; }
	 */
	public static void main(String[] args) 
	{  
		int V = 6; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj,0, 1);
        addEdge(adj,0, 2);
        addEdge(adj,2, 5);
        addEdge(adj,3, 4);
        addEdge(adj,4, 2);
       // addEdge(adj,3, 1);
            printGraph(adj);
		//System.out.println("Following is a Topological Sort of"); 
        List<Integer> result = topologicalSort(adj,V);
   //     result.stream().forEach(System.out::println);
}
}
