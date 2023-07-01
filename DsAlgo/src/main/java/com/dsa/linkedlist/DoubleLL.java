package com.dsa.linkedlist;

public class DoubleLL {

	Node head;
	static class Node {
		int data;
		Node prev,next;
		
		Node(int data){
			this.data = data;
			prev=next=null;
		}
	}
	
	
	void insertStart(int data) { 
		Node n2 = new Node(data);
		if(head==null) {
			head = n2;
		}
		else {  //
			Node n1 = head; 
			n2.next = n1;
			n1.prev = n2;
			head=n2;
			
		}
	}
	
	void insertAtLast(int data) {
		Node n2 = new Node(data);
		if(head==null) {
			head = n2;
		}else {
			
		
		Node n1=head;
		while (n1.next!=null) {
			n1=n1.next;
		}
		
		n1.next=n2;
		n2.prev=n1;
		}
	}
	
	void display() {
		if(head==null) {
			System.out.println("empty list");
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "-->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	void reverse() {
		Node n1=head;
		
		while(n1!=null) {
			head = n1;
			Node tmp = n1.next;
			n1.next = n1.prev;
			n1.prev = tmp;
			n1=tmp;
			
			
		}
		//head = tmp;
		
	}
	
	void removeLast() {
		Node n1 = head;
		if (n1.next == null) {
			head = null;
		} else {
			while (n1.next != null) {
				n1 = n1.next;
			}
			n1.prev.next = null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL doublell = new DoubleLL();
		doublell.insertStart(10);
		doublell.insertStart(30);
    	//doublell.insertStart(20);
		//doublell.insertStart(25);
		//doublell.insertAtLast(333);
		doublell.display();
		doublell.removeLast();
		doublell.display();
		
		//doublell.insertAtFirst(255);
	    doublell.reverse();
		doublell.display();
			
	}

}
