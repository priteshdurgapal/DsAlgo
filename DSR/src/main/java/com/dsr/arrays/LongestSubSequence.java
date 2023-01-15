package com.dsr.arrays;

import java.util.Arrays;

public class LongestSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {0,2,1,1,};
        Arrays.sort(nums);
        int result = 0;
        //int first = nums[0];
        int count = 1;
        for(int i=0;i<nums.length;i++) {
            
            if(i>0 && nums[i]==(nums[i-1]+1)) {
                count++;
             
           }else
           if(i>0 && nums[i]==nums[i-1]) {
               count = count;
           }
           else{
               count = 1;
           }
           result = Math.max(count,result);
           
           
       }
       //return result;
        System.out.println(result);
    }

}
