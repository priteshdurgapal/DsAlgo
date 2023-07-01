package com.dsa.hashing;

import java.util.HashSet;

public class SubArray0Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-3,4,-3,-1,1};
		HashSet<Integer> hs = new HashSet<Integer>();
		int preSum = 0;
		boolean result = false;
		
		for(int i=0;i<nums.length;i++) {
			preSum += nums[i];
			if(preSum==0) {
				result =  true;
			}
			if(hs.contains(preSum)) {
				result =  true;
			}
			else {
				hs.add(preSum);
			}
		}
		
		System.out.println(result);
		
	}

}
