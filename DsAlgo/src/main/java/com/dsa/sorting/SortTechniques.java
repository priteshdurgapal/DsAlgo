package com.dsa.sorting;

import java.util.Arrays;

public class SortTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "zcxdch";
		//sort
		char[] c = s1.toCharArray();
		Arrays.sort(c);
		String javalib = String.valueOf(c);
		System.out.println(javalib);
		
		//without library
		int[] charIndex = new int[26];
		for(char step:c) {
			charIndex[step-'a']++;
		}
		
		for(Integer i:charIndex) {
			System.out.println(i);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<charIndex.length;i++) {
			for(int j=0;j<charIndex[i];j++) {
				sb.append((char)(i+'a'));
			}
		}
		String result = sb.toString();
		System.out.println(result);
	}

}
