package com.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "ab";
	     String testString = "eidboaoo";
	     
	     int[] given = new int[126];
	     int[] pattern = new int[126];
	     
	     for(int i=0;i<input.length();i++) {
	    	 given[input.charAt(i)]++;
	    	 pattern[testString.charAt(i)]++;
	    	 
	     }
	     
	     for(int j=input.length();j<testString.length();j++) {
	    	 if(isEqual(pattern,given)) {
	    		 System.out.print(true);
	    	 }
	  
	    	 pattern[testString.charAt(j-input.length())]--;
	    	 pattern[testString.charAt(j)]++;
	    	 
	     }
	     
	    

	    }
	  public static boolean isEqual(int A[], int B[]) {
    	 for(int i=0;i<A.length;i++) {
    		 if(A[i]!=B[i]) {
    			 return false;
    		 }
    		 
    	 }
    	 return true;
     }
       

	

}
