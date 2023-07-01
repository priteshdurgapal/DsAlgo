package com.dsa.arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		
		int n = arr.length;
		int right = n-1;
		
		for(int i=0;i<n/2;i++) {
			int temp = arr[i];
			 arr[i] = arr[right];
			arr[right] = temp;
			right--;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + "");
		}
			
	}

}
