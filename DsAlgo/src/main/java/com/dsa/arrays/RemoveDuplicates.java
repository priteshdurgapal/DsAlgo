package com.dsa.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,1,2,2,4,4}; //1,2,3,4,
		 int k=1;
	        int j=0;
	        int n = nums.length;
	        for(int i=0;i<n-1;i++) {
	          if(nums[i]!=nums[i+1]) {
	              nums[j++]=nums[i];
	              k++;
	          }
	           
	        }
	      //   nums[j++]=nums[n-1];
	       System.out.println(k);
	       for(int i=0;i<k;i++) {
	    	   System.out.println(nums[i]);
	       }
	}

}
