package com.dsa.arrays;

public class MaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,19,0,4,1,7,100};
		int max = arr[0];
		int min = arr[0];
		int second_max = arr[0];
		int temp = -1;
		for(int i=1;i<arr.length;i++) {
			//if(min>arr[i]) {
			//	min = arr[i];
		//	}
			
			if(max<arr[i]) {
				second_max = max;
				
				max=arr[i];
				//System.out.println( max + "--" +i );
				
				//second_max = ma
				
			}
			if(second_max<arr[i] && second_max<max) {
				
				 temp = arr[i];
				//System.out.println( second_max + "--" +i);
			}
		}
		System.out.println( max);
		System.out.println( second_max);
		//System.out.println( max-min);
	}

}
