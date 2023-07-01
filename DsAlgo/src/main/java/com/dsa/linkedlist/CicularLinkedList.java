package com.dsa.linkedlist;

public class CicularLinkedList {

	Node head; 
	
	static class Node {
		Node next;
		int data;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void insertCircular(int data) {
		Node node  = new Node(data);
		if(head==null) {
			node.next = node;
		}
		else {
			Node curr = head;
			while(curr.next!=head) {
				curr = curr.next;
				
			}
			curr.next = node;
			node.next=head;
		}
		head = node;
		
	}
	
	public void display() {
		Node curr= head;
		if(head==null) {
			return;
		}
		System.out.print(curr.data + "->");
		curr=curr.next;
		while(curr!=head) {
			System.out.print(curr.data + "->");
			curr=curr.next;
		}
	}
	
	public void insertAtlast(int data) {
		Node node  = new Node(data);
		if(head==null) {
			node.next = node;
			head=node;
		}
		else {
		Node curr = head;
		while(curr.next!=head) {
			curr=curr.next;
		}
		curr.next = node;
		node.next=head;
		}
		//head = node;
	}
	public void delteAtHead() {
		Node curr = head;
		while(curr.next!=head) {
			curr = curr.next;
		}
		head=head.next;
		curr.next = head;
	}
	
	public void deltetKth(int k) {
		int i=0;
		Node curr = head;
		if(k==1) {
			//head=head.next;
			while(curr.next!=head) {
				curr=curr.next;
			}
			head=head.next;
			curr.next=head;
		}
		else {
		while(i!=k-2) {
			curr=curr.next;
			i++;
		}
		curr.next=curr.next.next;
		}
		//head=curr.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CicularLinkedList cll = new CicularLinkedList();
		
		/*
		 * cll.insertCircular(10); cll.insertCircular(30); cll.insertCircular(1);
		 */
		 
		//cll.display();
		cll.insertAtlast(99);
		cll.insertAtlast(88);
		cll.insertAtlast(77);
		cll.display();
		//cll.delteAtHead();
		System.out.println("");
		//cll.display();
		cll.deltetKth(1);
		System.out.println("");
		cll.display();
	}

}
