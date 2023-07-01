package com.dsa.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjanceListTwo {

	/*
	 * private static int V; private static ArrayList<ArrayList<Integer>> adj;
	 * 
	 * @SuppressWarnings("unchecked") AdjanceListTwo(int v) { V=v; adj = new
	 * ArrayList<ArrayList<Integer>>(v); for(int i=0; i<V;i++) { adj.add(new
	 * ArrayList<Integer>()); } }
	 */
	 static void addEdge(ArrayList<ArrayList<Integer>> adj,int v, int w) {
		 adj.get(v).add(w);
		 adj.get(w).add(v);
	 }
	 
		
		  static void printGraph(ArrayList<ArrayList<Integer>> adj) 
		  { for(int i=0;i<adj.size();i++) 
		  { for(int j=0;j<adj.get(i).size();j++) 
		  { System.out.print(adj.get(i).get(j)); }
		  System.out.println();
		  } }
		 
	 
	 static void bfs(ArrayList<ArrayList<Integer>> adj, int V, int source) {
		 boolean visited[] = new boolean[V+1];
		 int dist[] = new int[V+1];
		 
		 Arrays.fill(dist,-1);
	//	 dist[source] = 0;
		// visited[source] = true;
		for(int i=1;i<V;i++) {
			if(visited[i]==false) {
				 bfsRec(adj,i,visited, dist);
			}
		}
		System.out.println();
		for(int i=0;i<V;i++) {
		//	if(i!=source) {
			System.out.println(dist[i]);
		//	}
		}
		
	 }
	 
	 static void bfsRec(ArrayList<ArrayList<Integer>> adj,int source, boolean visited[], int dist[]) {
		 
		 visited[source] = true;
		 dist[source] = 0;
		 Queue<Integer> qIn = new LinkedList<>();
		 qIn.add(source);
		 while(qIn.isEmpty()==false) {
			 int u = qIn.poll();
			 System.out.println(u);
			 for(int v:adj.get(u)) {
				 if(!visited[v]) {
					 visited[v] = true;
					 dist[v] = dist[u] + 7;
					 qIn.add(v);
				 }
			 }
		 }
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AdjanceListTwo topo = new AdjanceListTwo(7);
		/* original list 
		 * topo.addEdge(adj,0,1); topo.addEdge(adj,0,2); topo.addEdge(adj,1,3);
		 * topo.addEdge(adj,1,2);
		 */
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 
		/*
		 * addEdge(adj,0,1); addEdge(adj,0,2); addEdge(adj,2,3); addEdge(adj,1,3);
		 * addEdge(adj,4,5); addEdge(adj,5,6); addEdge(adj,4,6);
		 */
		//topo.addEdge(adj,1,2);
    	
    	addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,3,2);
    //	addEdge(adj,3,2);
    	addEdge(adj,4,4);
    	//addEdge(adj,3,4); 
    	
		
		printGraph(adj);
		System.out.println();
		bfs(adj,V,0);
	//	dfs(adj,0);
		
	}

}
