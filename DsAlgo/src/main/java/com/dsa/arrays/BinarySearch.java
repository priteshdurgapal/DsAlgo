package com.dsa.arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 5 };
		int target = 7;
		System.out.println(arr.length);
		int number = numSearch(arr, 0, arr.length-1, target);
		if(number == -1) {
			System.out.println("number not found");
		}else {
		System.out.println("number found at index->" + number);
		}
		

	}
	
	private static int numSearch(int[] arr,int l, int r, int target) {
		
		if(l<=r) {
			int mid = l +(r-l)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]>target) {
				return numSearch(arr,l,mid-1,target);
			}
			else {
				return numSearch(arr,mid+1,r, target);
			}
		}
		
		return -1;
		
	}

}
