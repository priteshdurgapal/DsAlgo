package com.dsr.hashing;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,5,7,19,34};
		int sum = 53;
		boolean result = false;
		Set<Integer> st = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(st.contains(sum-arr[i])) {
				result = true;
			} else {
				st.add(arr[i]);
			}
			
		}
		
		System.out.println(result);

	}

}
