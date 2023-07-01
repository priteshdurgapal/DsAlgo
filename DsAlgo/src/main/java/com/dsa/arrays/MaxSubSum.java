package com.dsa.arrays;

public class MaxSubSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] sum = {-5,1,-2,3,-1,2,-2};
			
			int preSum = sum[0];
			int result = Integer.MIN_VALUE;
			for(int i=1;i<sum.length;i++) {
				preSum = Math.max((preSum+sum[i]),sum[i]);
				//System.out.println(preSum+ "->>" +i);
				result = Math.max(preSum,result);
			}
			System.out.println(result);
	}

}
