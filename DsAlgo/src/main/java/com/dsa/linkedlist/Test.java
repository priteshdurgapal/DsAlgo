package com.dsa.linkedlist;

import com.dsa.linkedlist.SingleList.Node;

public class Test {

	static Node head;

	  static class Node{
	    int data;
	    Node next;
	    Node(int d) {
	      data = d;
	      next=null;
	    }
	  }
	  
	  static void insertRec(int data) {
		  Node node = new Node(data);
		  if(head==null) {
			  head = node;
			  return;
		  }
		  Node curr=head;
		  while(curr.next!=null) {
			  curr = curr.next;
		  }
		  curr.next = node;
	  }

	  static void printList(Node head) {
	    Node n = head;
	    while (n!=null) {
	      System.out.println(n.data);
	      n=n.next;
	    }
	  }
	  static void removeNthNode(Node head,int n) {
		  Node curr = head;
		  int size=0;
		  while(curr!=null) {
			  curr = curr.next;
			  size++;
		  }
		  if(size<n) {
			  head =  null;
			  return;
		  }
		  int fwd = 1;   //1->2->3->4->5
		  Node hop = head;
		  
		  while(fwd!=size-n) {
			  hop=hop.next;
			  fwd++;
			  
		  }
		  if(hop.next!=null) {
			  hop.next = hop.next.next;

		  } else {
			  head = head.next;
		  }
		  		  
	  }
	  
	  static Node reverse(Node head) {
		  //1->2->3->4->5   prev=null // fwd
		  Node prev=null;
		  Node fwd = null;
		  Node curr = head;
		  while(curr!=null) {
			    fwd = curr.next;
			    curr.next = prev;
			    prev=curr;
			    curr=fwd;
			   // curr=curr.next;
		  }
		  head=prev;
		  return head;
	  }
	  
	 public static void main(String[] args) {
	   // SingleList singleList =  new SingleList();
	  //  singleList.head = new Node(1);
		 insertRec(1);
		 insertRec(2);
		 insertRec(3);
		 insertRec(4);
		 insertRec(5);
		 printList(head);
		 //removeNthNode(head,2);
		 head= reverse(head);
		 
		 
		 System.out.println("==========");
		 printList(head);
	  }

}
