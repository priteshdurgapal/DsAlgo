package com.dsa.string;

import java.util.HashMap;
import java.util.HashSet;

public class LongestNonRepeatSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcdbcdbabcbb"; //
		int start = 0;
		int end = 0;
		
		int maxlength = 0;
		HashSet<Character> hs = new HashSet<>();
		
		while(end<s1.length()) {
			if(hs.add(s1.charAt(end))) {
				end++;
				maxlength=Math.max(maxlength,hs.size());
			}
			else {
				hs.remove(s1.charAt(start));
				start++;
			}
		}
		
		System.out.println(maxlength);
	
	}

}
