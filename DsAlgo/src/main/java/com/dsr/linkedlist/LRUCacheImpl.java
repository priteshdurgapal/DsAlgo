package com.dsr.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCacheImpl {

	

		HashMap<Integer,String> cacheValues = new HashMap<Integer,String>();
		LinkedList<Integer> linkedKeys = new LinkedList<Integer>();
		
		int capacity;
		
		LRUCacheImpl(int capacity) {
			this.capacity = capacity;
		}
		
		void put(int key, String val) {
			if(linkedKeys.size() >= capacity) {
				int keyRemoved = linkedKeys.removeLast(); 
				cacheValues.remove(keyRemoved);
			}
			
			linkedKeys.addFirst(key);
			cacheValues.put(key,val);
		}
		
		String get(int key) {
			String res = cacheValues.get(key);
			if(res!=null) {
				linkedKeys.remove( (Object)key);
				linkedKeys.addFirst(key);
			}
			else {
				res = null;
			}
			
			return res;
		}
		public void display() {

			for (int i = 0; i < linkedKeys.size(); i++) {
				int key = linkedKeys.get(i);
				System.out.println(key + " => " + cacheValues.get(key));
			}
		}
		
	public static void main(String[] args) {
		LRUCacheImpl cache = new LRUCacheImpl(3);
		cache.put(1, "one");
		cache.put(2, "two");
		cache.put(3, "three");
		System.out.println("===========");
		//cache.display();
		cache.put(4, "four"); // putting new cache when full. 1 will be removed
		cache.display();
		cache.get(3); // accessing 3, it will be moved to top
		cache.get(2);// accessing 2, it will be moved to top
		cache.put(1, "one"); // putting new cache when full. 4 will be removed
		cache.get(3);// accessing 3, it will be moved to top
		cache.get(1);// accessing 1, it will be moved to top
		System.out.println("===========");
		cache.display(); // 1 should be on top
	}

}
