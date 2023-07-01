package com.dsa.linkedlist;

public class SinglyList {

	Node head = null;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void insertStart(int n) {
		Node node = new Node(n);
		node.next = head;
		head = node;
	}
	
	public Node getElement(int data) {  //value based key
		Node node = head;
		Node result  = null;
		while(node!=null) {
			if(node.data == data) {
				result = node;
			}
			
			node = node.next;
		}
		return result;
		
	}

	public void display() {
		System.out.println("printing....");
		Node node = head;
		while (node != null) {
			System.out.print(node.data);
			node = node.next;
			if (node != null) {
				System.out.print("->");
			}
		}
		System.out.println();
	}

	public void insertAtLast(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}
		
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = node;

	}
	
	public void delete(int data) {
		Node n =head;
		
		if(head==null) {
			return;
		}
		
		if(n.data==data) {
			head = null;
		}
		
		while(n.next != null) {
			if(n.next.data == data) {
				n.next = n.next.next;
				//return head;
			}
			n = n.next;
		}
	}
	
	/*
	 * public static Node reverseList(Node head) { Node curr = head; Node prev =
	 * null; Node next = null; //1->3->4->5->6 while(curr!=null) {
	 * 
	 * } }
	 */

	public static void main(String args[]) {
		SinglyList sll = new SinglyList();
		
		
		  sll.insertStart(10); 
		  sll.insertStart(9);
		  sll.insertStart(101);
		  sll.insertStart(12);
		 
		 
		
		
		/*
		 * sll.insertAtLast(1); sll.insertAtLast(2); sll.insertAtLast(3);
		 */
		 
		 
		sll.display();
		//sll.delete(2);
		//sll.display();
	}
}
