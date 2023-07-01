package com.dsr.dynamic;

public class FibonacciSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		//0,1,1,2,3,
		
		int number = fibRec(n);
		System.out.println(number);
		int[] dp = new int[n+1]; //5
		for(int i=0;i<dp.length;i++) { 
			dp[i] = -1;
		}
		int number2 = fibRecDp(n,dp);
		System.out.println(number2);

	}
	
	static int fibRec(int n) {
		
		if(n==0||n==1) {
			return n;
		}
		
		
		return fibRec(n-1) + fibRec(n-2);
	}
	
	static int fibRecDp(int n, int[] dp) {
		
		if(dp[n]==-1) {
			//return dp[n];
			
			if(n==0||n==1) {
				dp[n]=n;
			}
			else {
			dp[n] = fibRecDp(n-1,dp) + fibRecDp(n-2,dp);
			}
			
		}
		return dp[n];
	}
	
	
	

}
