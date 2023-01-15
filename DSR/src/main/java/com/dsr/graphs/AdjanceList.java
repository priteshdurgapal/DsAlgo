package com.dsr.graphs;

import java.util.LinkedList;
import java.util.List;

public class AdjanceList {

	private static int V;
	private static  LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	AdjanceList(int v) {
		V=v;
		adj = new LinkedList[v];
		for(int i=0; i<v;i++) {
			adj[i] = new LinkedList();
		}
	}
	 static void addEdge(LinkedList<Integer> adj[],int v, int w) {
		 adj[v].add(w);
	 }
	 
	 static void printGraph() {
		 for(int i=0;i<V;i++) {
			 for(int j=0; j<adj[i].size();j++) {
				 System.out.print(adj[i].get(j));
			 }
			 System.out.println();
		 }
	 }
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjanceList topo = new AdjanceList(4);
		topo.addEdge(adj,0,1);
		topo.addEdge(adj,0,2);
		topo.addEdge(adj,1,3);
		topo.addEdge(adj,1,2);
		topo.addEdge(adj,2,0);
		topo.addEdge(adj,2,1);
		topo.addEdge(adj,3,1);
		topo.addEdge(adj,1,0);
		
		printGraph();
		
	}

}
