package com.dsa.sorting;

public class TestMergeSort {

	public void mergeSort(int[] ar, int l, int r) {
		
		if(l<r) {
			
			int m = l + (r-l)/2;
			System.out.println("start itr--->" + m);
			mergeSort(ar,l,m);
			mergeSort(ar,m+1,r);
			merge(ar,l,m,r);
			
		}
		
	}
	
	public void merge(int[] ar, int l, int m, int r) {
		int n1 = m-l+1;
		System.out.println("start merge--n1" + n1);
		int n2 = r-m;
		System.out.println("start merge--n2" + n2);
		int[] s1 = new int[n1];
		int[] s2 = new int[n2];
		for(int i=0;i<n1;i++) {
			s1[i] = ar[l+i];
		}
		System.out.println("s1-->");
		display(s1);
		for(int i=0 ; i<n2;i++) {
			s2[i]=ar[m+1+i];
		}
		System.out.println("s2-->");
		display(s2);
		int i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(s1[i]<=s2[j]) {
				ar[k] = s1[i];
				k++;
				i++;
				
			}
			else {
				ar[k]=s2[j];
				k++;
				j++;
			}
		}
		while(i<n1) {
			ar[k] = s1[i];
			i++;k++;
		}
		while(j<n2) {
			ar[k] = s2[j];
			j++;
			k++;
		}
		System.out.println("ar-->");
		display(ar);
		System.out.println("-----eol----");
	}
	
	public void display(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,108,90,5,4,30,1};
		
		TestMergeSort testMergeSort = new TestMergeSort();
		testMergeSort.mergeSort(arr,0,arr.length-1);
		testMergeSort.display(arr);
	}

}
