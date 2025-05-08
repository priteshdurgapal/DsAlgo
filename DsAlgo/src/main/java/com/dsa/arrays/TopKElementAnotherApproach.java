package com.dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKElementAnotherApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,3,3,3};
		int k = 2;
		
		Map<Integer, Integer> mp = new HashMap<>();
		
		for(Integer i:nums) {
			mp.put(i,mp.getOrDefault(i, 0)+1);
		}
		
		mp.entrySet().forEach(System.out::println);
		
		mp.forEach((id,val) -> { 
			System.out.println(id+ "-" + val);
			
		});
		
		//List<int[]>  
		List<int[]> liAr = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> interimResult : mp.entrySet()) {
			liAr.add(new int[] {interimResult.getKey(),interimResult.getValue()});
		}
		
		for(int[] li: liAr) {
			for(int i=0;i<li.length;i++) {
				System.out.println(li[i]);
			}
		}
		
	}

}
