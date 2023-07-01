package com.dsa.graphs;

import java.util.*; 

public class TopoDFS { 

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v);   //Directed Graph edges
	} 

    static void DFS(ArrayList<ArrayList<Integer>> adj, int u,Stack<Integer> st, boolean visited[]) 
    { 	
        visited[u]=true;
        
        for(int v:adj.get(u)){
            if(visited[v]==false) {
            	visited[v]=true;
                DFS(adj,v,st,visited);
            }
        }
        st.push(u);
    }
    
    
    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V) 
    { 
        boolean[] visited=new boolean[V]; 
    	for(int i = 0;i<V; i++) 
    		visited[i] = false;
    	Stack<Integer> st = new Stack<Integer>(); 
        
        for(int u=0;u<V;u++){
            if(visited[u]==false){
                DFS(adj,u,st,visited);
            }
        }
        
        while (st.empty() == false) 
            System.out.print(st.pop() + " "); 
       
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

	public static void main(String[] args) 
	{  
		int V = 6; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj,5, 2);
        addEdge(adj,5, 0);
        addEdge(adj,4, 0);
        addEdge(adj,4, 1);
        addEdge(adj,2, 3);
        addEdge(adj,3, 1);
            printGraph(adj);
		System.out.println("Following is a Topological Sort of"); 
        topologicalSort(adj,V);
	} 
} 

