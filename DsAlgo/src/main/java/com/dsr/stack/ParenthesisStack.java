package com.dsr.stack;

import java.util.Stack;

public class ParenthesisStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = false;
		String s = "{[()]}";
		if(s.length()==0 && s.length() ==1) {
            result =  false;
        }
    //    char[] parn = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
         result = false;
        
        for(char se : s.toCharArray()) {
            if( se == '(' || se == '{' || se== '[' ) {
                st.push(se);
            }
            
            if(se==')' || se=='}' || se==']') {
            char x = st.pop();
            if( se == ')' && x!= '(' ) {
               result = false;
            }
            if( se == ']' && x!= '[' ) {
               result = false;
            }
            if( se == '}' && x!= '{' ) {
               result = false;
            }
            }

        }

        if(st.size()==0) {
            result = true;
        }

        System.out.println(result);
    }
	

}
