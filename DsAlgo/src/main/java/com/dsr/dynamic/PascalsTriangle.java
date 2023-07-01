package com.dsr.dynamic;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		 List<List<Integer>> finGen = new ArrayList<>();
	       
	        int[][] dp = new int[numRows+1][numRows+1];
	        dp[0][0]=1;
	        for(int i=1;i<=numRows;i++) {
	        	 List<Integer> lin = new ArrayList<>();
	            for(int j=1;j<i+1;j++) {
	                if(i==j||j==1) {
	                    dp[i][j]=1;
	                } else {
	                    dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
	                }
	                lin.add(dp[i][j]);
	            }
	            finGen.add(lin);  
	            
	        }
	        
	        System.out.println(finGen);
	            
	    }
	

}
