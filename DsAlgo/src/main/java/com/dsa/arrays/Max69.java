package com.dsa.arrays;

public class Max69 {

	public static void main(String[] args) {
				int num = 9669;
		        int maxNumber = num;
		        int number = num;
		        int operationNumber = num;
		        int i=1;
		        while(num!=0) {
		            int digit = num%10; //9
		            int tens = 0;
		            if(digit == 6 ) {
		                //digit+= 3;
		               tens = 3*i;
		            }
		            number = number + tens;
		            maxNumber = Math.max(number, maxNumber);
		            i = i*10;
		            num=num/10;
		            number=operationNumber;
		        }
		        System.out.println( maxNumber);
		        
		        String num1 = Integer.toString(num);
		        for(int j=0;j<num1.length();j++) {
		        	int digit = Integer.parseInt(String.valueOf(num1.charAt(i)));
		        	if(digit==6) {
		        		
		        	}
		        }
		    
		

	}

}
