package com.dsa.arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3,5,6,7};
		int targetSum = 13;
		int i=0;
		int j = arr.length-1;
		while(i<j) {
			int theSum = arr[i]+arr[j]; 
			if(theSum == targetSum) {
				System.out.println(i + "and " + j);
			}
			if (theSum < targetSum) {
				i++;
			} else {
				j--;
			}
		}
	}

}
