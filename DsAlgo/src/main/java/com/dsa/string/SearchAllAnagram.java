package com.dsa.string;

public class SearchAllAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "geeksforgeeks";
		String s2="frog";
		int patLen = s2.length();
		int givenLen=s1.length();
		
		int[] countOfString = new int[256];
		int[] countOfPattern = new int[256];
		
		for(int i=0;i<patLen;i++) {
			countOfPattern[s2.charAt(i)]++;
			countOfString[s1.charAt(i)]++;
		}
		
		for(int i=patLen;i<givenLen;i++) {
			if(isEqual(countOfPattern,countOfString)) {
				System.out.println("anagram at " + (i-patLen));
			}
			
			countOfString[s1.charAt(i)]++;
			countOfString[s1.charAt(i-patLen)]--;
			
			
		}
		if(isEqual(countOfPattern,countOfString)) {
			System.out.println("anagram at " + (countOfPattern.length-patLen));
		}
		
		
		

	}
	
	static boolean isEqual(int[] A, int[] B) {
		for(int i=0;i<256;i++) {
			if(A[i]!=B[i]) {
				return false;
			}
		}
		return true;
	}

}
