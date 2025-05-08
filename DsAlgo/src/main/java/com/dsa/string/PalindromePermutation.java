package com.dsa.string;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "racceare"; //raceecar -> given string s is pemutation of racecar
		int[] charFreq = new int[126];
		for(int i=0;i<s.length();i++) {
			charFreq[s.charAt(i)]++;
		}
		int count = 0;
		for(int i=0;i<charFreq.length;i++) {
			count+=charFreq[i]%2;
		}
		
		System.out.print(count<=1);

	}

}
