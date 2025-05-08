package com.dsa.arrays;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Was it a car or a cat I saw";
		System.out.println(isPalindrome(s));

	}
	
	public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        boolean result = true;
        while(l<r) {
        	 if(s.charAt(l)==' ') {
                 l++;
              }
              if(s.charAt(r)==' ') {
                  r--;
              }
            
              if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) {
                    return false;
              }
               l++;
                r--; 
        }
        return result;
    }
	

}
