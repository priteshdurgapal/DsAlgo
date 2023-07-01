package com.dsa.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDirected {
	//KAhn's Based Algorithm
	
	//indegree based topological sort (BFS)

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
	}
	
	static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V) {
		int[] indeg = new int[V];
		for(int i=0;i<V;i++) {
			for(int x:adj.get(i)) {
				indeg[x]++;
			}
		}
		int count=0;
		Queue<Integer> qIn = new LinkedList<Integer>();
		for(int i=0;i<V;i++) {
			if(indeg[i]==0) {
				qIn.add(i);
			}
		}
		while(qIn.size()>0) {
			int u = qIn.poll();
			for(int i:adj.get(u)) {
				if(--indeg[i]==0) {
					qIn.add(i);
				}
			}
			count++;
		}
		if(count!=V) {
			System.out.println("cycle");
		}
		else {
			System.out.println("no cycle");
		}
	}
	
	public static void main(String[] args) {
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0, 1); 
            addEdge(adj,4, 1); 
            addEdge(adj,1, 2); 
            addEdge(adj,2, 3); 
            addEdge(adj,3, 1);  
		
        topologicalSort(adj,V);

	}

}
