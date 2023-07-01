package com.dsa.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class Frequencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,20,20,30,30,40,10};
		Map<Integer, Integer> hm = new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i],hm.get(arr[i]) + 1);
			}
			else {
				hm.put(arr[i],1);
			}
		}
		for( Map.Entry<Integer, Integer> itr : hm.entrySet()) {
			System.out.println(itr.getKey() + "->" + itr.getValue());
		}
		System.out.println();
		
		Iterator<Map.Entry<Integer,Integer>> iterator = hm.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer,Integer> em = iterator.next();
			System.out.println(em.getKey() + "->" + em.getValue());
		}
		System.out.println();
		
		hm.entrySet().stream().forEach(e-> System.out.println(e.getKey() + "-" + e.getValue()) );
		
	}

}
