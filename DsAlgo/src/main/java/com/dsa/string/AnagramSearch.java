package com.dsa.string;

import java.util.Arrays;

public class AnagramSearch {
	
	public static void main(String[] args) {
	/*String s1="listey";
	String s2="silent";
	
	char[] arrOfS1 = s1.toCharArray();
	char[] arrOfS2 = s2.toCharArray();
	
	Arrays.sort(arrOfS1);
	Arrays.sort(arrOfS2);
	
	boolean result = true;
	for(int i=0;i<arrOfS1.length;i++) {
		if(arrOfS1[i]!=arrOfS2[i]) {
		  result=false;
		}
	}
	System.out.println(result);
	}*/
	
		String s1="listen";
		String s2="silent";
		boolean result = true;
		
		if(s1.length()!=s2.length()) {
			result = false;
		}
		
		char[] arrOfS1 = s1.toCharArray();
		char[] arrOfS2 = s2.toCharArray();
		
		int[] count = new int[256];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				result=false;
			}
		}
		
		System.out.println(result);
		
		String s= "Hello";
		String sub = s.substring(2, 1);
		System.out.println(sub);
		
}
}
