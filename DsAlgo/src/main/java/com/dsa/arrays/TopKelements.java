package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int[] arr  =  {6,9,9,9,2,2,2,3,3,9,9,9,2,3,4,4,5,5,6};
	 int k = 5;
	 
	 Map<Integer, Integer> mp = new HashMap<>();
	 
	 for(int i=0;i<arr.length;i++) {
		 mp.put(arr[i],mp.getOrDefault(arr[i],0) +1);
		 
	 }
	 
	 mp.forEach( (key,value) -> {
		 System.out.println(key +"--"+ value);
	 });
	 
	 System.out.println("======");
	 Map<Integer,Integer> lmp = mp.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
			 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
	 
	 lmp.forEach( (key,value) -> {
		 System.out.println(key +"--"+ value);
	 });
	 
	 for(Map.Entry<Integer,Integer> me:lmp.entrySet()) {
		 k--;
		
		 if(k<0) {
			 break;
		 }
		 System.out.println(me.getKey());
	 }
	 List<List<Integer>> lili = new ArrayList<>();
	 
	}
	

}
