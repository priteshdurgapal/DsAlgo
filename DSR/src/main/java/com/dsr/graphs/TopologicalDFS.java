package com.dsr.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalDFS {
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
	} 
	
	 static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V)  {
		 boolean[] marked = new boolean[V];
		 Stack<Integer> st  = new Stack<Integer>();
		 for(int i=0; i<V;i++) {
			 if(marked[i]==false) {
			    DFS(adj,i,st,marked);
			 }
		 }
		 while (st.empty() == false) 
	            System.out.print(st.pop() + " "); 
	 }
	 
	static void DFS(ArrayList<ArrayList<Integer>> adj, int source, Stack<Integer> st, boolean[] marked) {
		marked[source]=true;
		for(int v: adj.get(source)) {
			if(marked[v]==false) {
			//	marked[v]=true;
				 DFS(adj,v,st,marked);
			}
		}
		st.push(source);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0, 1); 
            addEdge(adj,1, 3); 
            addEdge(adj,2, 3); 
            addEdge(adj,3, 4); 
            addEdge(adj,2, 4); 
		
		System.out.println("Following is a Topological Sort"); 
        topologicalSort(adj,V);
	}

}
