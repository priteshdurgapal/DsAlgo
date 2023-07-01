package com.dsr.hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,20,3,10,5};
		HashSet<Integer> hs = new HashSet<Integer>();
		
		int preSum = 0;
		int  givenSum = 33;
		boolean result = false;
		
		for(int i=0;i<nums.length;i++) {
			 preSum += nums[i];
			if(givenSum==preSum) {
				result =  true;
			}
			if(hs.contains(preSum-givenSum)) {
				result=true;
			}
			else {
				hs.add(preSum);
			}
			
		}
		
		System.out.println(result);
	

	}

}
