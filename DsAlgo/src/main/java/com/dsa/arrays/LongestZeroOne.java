package com.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestZeroOne {

	 public static void main (String[] args) {
	        int arr[] = {1, 1, 1, 0, 1, 0, 1, 1, 1};
	        int len = arr.length;
	        
	        System.out.println(largestZeroSubarray(arr, len));
	    }
	    
	    static int largestZeroSubarray(int arr[], int n)
	    {
	        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
	        int sum = 0, maxLen = 0;
	        for(int i = 0; i < n; i++)
	         arr[i] = (arr[i] == 0) ? -1 : 1;
	         
	       for(int i = 0; i < n; i++)
	        {
	            sum += arr[i];
	            if (sum == 0)
	             maxLen = i+1;
	             
	            if(mp.containsKey(sum) == false)
	            {
	                mp.put(sum,i);
	            }
	            if(mp.containsKey(sum)) {
	                maxLen = Math.max(maxLen,i-mp.get(sum));
	            }
	             
	        }
	        return maxLen;
	    }
}
