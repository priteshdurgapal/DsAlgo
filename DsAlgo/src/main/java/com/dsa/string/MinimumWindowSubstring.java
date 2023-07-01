package com.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ADOBECODEBANC";
		String t = "ABC";
		String result = null;
		if(s == null || s.length() == 0 || t == null || t.length() == 0 || t.length()>s.length())
            result =  "No value";
 
		if(result==null) {
		
        //create a map to save the characters in t
        Map<Character,Integer> map =  new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
			
        }
 
        //maintain a counter to check whether match all characters in t
        int count = 0;
        //two pointers: begin-end, one point to tail and one  head
        int begin = 0, end = 0;
        //distance between begin and end
        int min = Integer.MAX_VALUE;
        //head pointer of the result substring
        int head = 0;
 
        //loop through s
        while(end < s.length()){
            //get a character
            char c = s.charAt(end);
            //if the map contains the character c, we consider it as a effective character
            if(map.containsKey(c)){
                //then increment the count by 1
                map.put(c, map.get(c)-1);
                //because the character c exists in t, we have to consider it as a valid character
                if(map.get(c) >= 0)
                    //increment the count by 1
                    count ++;
            }
            end++;
 
            //when the count is equal to t's length, in other word, find a valid substring
            while(count == t.length()){
                //if find a substring whose length is less than min, then update min
                if(end-begin < min) 
                   // min = end - (head=begin);
                	min = end-begin;
                	head=begin;
 
                //if the map contains the character s[begin], we should plus one to make it invalid/not effective again
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);
                    //plus one make it invalid
                    if(map.get(tempc) > 0)
                        //decrement the count by 1
                        count--;
                }
                //move the begin pointer to find the new substring
                begin ++ ;
            }
 
        }
		
        //return the result substring
        if(min == Integer.MAX_VALUE) 
            result =  "";
        result =  s.substring(head, head+min);
		}
        
        System.out.println(result);
    }
}
	


