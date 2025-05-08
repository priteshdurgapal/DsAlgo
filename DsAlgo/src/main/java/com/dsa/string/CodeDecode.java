package com.dsa.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> liS = Arrays.asList("lint","code","love","you");
		
		StringBuilder sb = new StringBuilder();
		for(String s:liS) {
			sb.append(s.length()).append("#").append(s);
		}
		String result = sb.toString();
		System.out.println(result);
		
		List<String> decoded = new ArrayList();
		
		int i=0;
		while(i<result.length()) {
			int code = result.indexOf('#',i);
			System.out.println("code-->"+code);
			int size = Integer.valueOf(result.substring(i, code));
			System.out.println("size-->"+size);
			decoded.add(result.substring(code+1,code+size+1));
			i=code+size+1;
			System.out.println("i-->" + i);
		}

	}

}
