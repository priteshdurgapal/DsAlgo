package com.dsa.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		int[] pre = new int[n];
		int[] suff = new int[n];
		int[] res = new int[n];
		pre[0] = 1;
		suff[n-1] = 1;
				
		for(int i=1;i<n;i++) {
			pre[i] = pre[i-1]*arr[i-1];
			
		}
		
		for(int i=n-2;i>=0;i--) {
			suff[i] = suff[i+1]*arr[i+1];
		}
		
		for(int i=0;i<n;i++) {
			res[i] = pre[i]*suff[i];
		}
		//Arrays.stream(pre).forEach(System.out::println);
		//Arrays.stream(suff).forEach(System.out::println);
		Arrays.stream(res).forEach(System.out::println);
	}

}
