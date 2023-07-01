package com.dsa.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,2,6,7,8,9};
		int len = arr.length-1;
		int i=0;
		while(i<len) {
			int temp = arr[i];
			arr[i] = arr[len];
			arr[len] = temp;
			i++;
			len--;
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] + ",");
		}
	}

}
