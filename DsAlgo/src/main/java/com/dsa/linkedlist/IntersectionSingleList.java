package com.dsa.linkedlist;
import com.dsa.linkedlist.SinglyList;
public class IntersectionSingleList {

	public static void main(String args[]) {
	SinglyList single1 = new SinglyList();
	single1.insertStart(1);
	single1.insertStart(2);
	single1.insertStart(7);
	single1.insertStart(9);
	single1.insertStart(5);
	single1.insertStart(1);
	single1.insertStart(3);
	
	SinglyList single2 = new SinglyList();
	single2.insertStart(1);
	single2.insertStart(2);
	single2.insertStart(single1.getElement(7).data);
	single2.insertStart(6);
	single2.insertStart(4);
	
	System.out.println(single1.getElement(7));
	
	single1.display();
	single2.display();
	}
	
	
}
