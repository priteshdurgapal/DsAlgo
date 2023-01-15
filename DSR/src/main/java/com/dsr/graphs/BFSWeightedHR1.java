package com.dsr.graphs;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class BFSWeightedHR1 {

	
	

	    /*
	     * Complete the 'bfs' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER m
	     *  3. 2D_INTEGER_ARRAY edges
	     *  4. INTEGER s
	     */

	    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
	    // Write your code here
	        List<Integer> fIn = new ArrayList<>();
	        
	        int[] dist = new int[n];
	        for(int i=s;i<n;i++) {
	            dist[i] = Integer.MAX_VALUE;
	        }
	        boolean marked[] = new boolean[n];
	        for(int i=s;i<n; i++) {
	            if(marked[i]==false) {
	                 //BFSRec(n,edges,s, marked, dist);
	                 BFSRec(n,edges,s, marked);
	            }
	            
	        }
	        for(int i=s;i<n;i++) {
	            fIn.add(dist[i]);
	        }
	        return fIn;
	    }
	    
	  //  public static void BFSRec(int n, List<List<Integer>> edges, int s, 
	    public static void BFSRec(int n, List<List<Integer>> edges, int s, 
	    boolean[] marked){
	        
	           marked[s] = true;
	       //    dist[s] = 0;
	           Queue<Integer> qIn = new LinkedList<Integer>();
	           qIn.add(s);
	           
	           while(qIn.size()>0) {
	               int ele = qIn.poll();
	               System.out.println(ele);
	             //  Iterator<Integer> itr = edges.get(ele).iterator();
	               for(int v:edges.get(ele)) {
	              // while(itr.hasNext()) {
	            	  // int i = itr.next();
	                   if(marked[v]==false) {
	                    //   dist[v] = dist[v]+1;
	                       marked[v] = true;
	                       qIn.add(v);
	                   }
	               }
	              
	           }
	    }

	}

	


