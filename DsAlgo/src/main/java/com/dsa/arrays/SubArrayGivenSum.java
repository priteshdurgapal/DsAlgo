package com.dsa.arrays;

public class SubArrayGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = new int[6];
		int[] nums = {1,4,20,3,10,5}; 
		int sum = 33;
		
		int s=0;
		int curr=0;
		for(int i=0;i<nums.length;i++) {
			curr += nums[i];
			while (curr>sum) {
				curr -= nums[s]; 
				s++;
			}
			if(curr==sum) {
				System.out.println("lies here->" + s + ":" + i);
			}
			
		}
	

	}

}
