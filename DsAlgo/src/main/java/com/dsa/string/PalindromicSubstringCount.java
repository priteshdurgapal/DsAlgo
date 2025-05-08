package com.dsa.string;

public class PalindromicSubstringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "car";
		int res =0;
		int l=0,r=0;
		
		for(int i=0;i<s.length();i++) {
			l=i;r=i;
			while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)) {
				res++;
				l-=1;
				r+=1;
			}
			
			l=1;
			r=i+1;
			while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)) {
				res++;
				l-=1;
				r+=1;
			}
			
		}
		System.out.print(res);

	}

}
