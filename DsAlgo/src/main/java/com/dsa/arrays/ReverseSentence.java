package com.dsa.arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Let's connect after sometime";
		// sometime after connect Let's
		
		String[] operated = s.split("\\s");
		/*int l=0; 
		int r=operated.length-1;
		while(l<r){
			String temp=operated[l];
			operated[l]=operated[r];
			operated[r]=temp;
			
			l++;r--;
		}
		StringBuilder sb = new StringBuilder();
		for(String it:operated) {
			sb.append(it).append(" ");
		}
		String result = sb.toString().trim();
		System.out.println(result); */
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=operated.length-1; i>=0;i--) {
			sb.append(operated[i]).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
