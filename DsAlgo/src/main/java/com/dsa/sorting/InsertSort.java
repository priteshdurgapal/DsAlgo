package com.dsa.sorting;

public class InsertSort {

	public void sort(int[] arr, int n) {
		 
		//1 --> key
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[]) {
		InsertSort insertSort = new InsertSort();
		int[] arr = {13,1,41,2,23,7,8};
		insertSort.sort(arr, arr.length);
		insertSort.display(arr);
	}
}
