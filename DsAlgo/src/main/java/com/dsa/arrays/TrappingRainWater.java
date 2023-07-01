package com.dsa.arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr  = {5,0,6,2,3};
		int[] arr = { 0 , 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int size = arr.length;
		int[] l_max = new int[size];
		int[] r_max = new int[size];
		
		//
		l_max[0] =  arr[0];
		
		for(int i=1; i<size; i++) {
			l_max[i] = Math.max(l_max[i-1], arr[i]);
		}
		r_max[size-1] = arr[size-1];
		
		for(int i=size-2; i>0; i--) {
			r_max[i] = Math.max(r_max[i+1], arr[i]);
		}
		int result  = 0;
		for(int i=1;i<size-1;i++ ) {
			result +=  Math.min(l_max[i], r_max[i])-arr[i];
		}
		
		System.out.println(result);
	}

}
