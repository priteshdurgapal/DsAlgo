package com.dsr.arrays;

public class ConsecutiveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {1,0,1,1,0,0,1,1,0};
       
       int res = 0;
       int window_result = 0;
       
       for(int i=0; i<arr.length;i++) {
    	   
    	   if(arr[i]==1) {
    		   window_result+=1;
    		   if(window_result>res) {
    			   res = window_result;
    		   }
    	   }
    	   else {
    		   window_result = 0;
    	   }
       }
       System.out.println("res-->" + res);
	}

}
