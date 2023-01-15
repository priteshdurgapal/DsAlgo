
package com.dsr.linkedlist;
import java.util.*;

public class SingleList {

  Node head;

  static class Node{
    int data;
    Node next;
    Node(int d) {
      data = d;
      next=null;
    }
  }

  public void printList() {
    Node n = head;
    while (n!=null) {
      System.out.println(n.data);
      n=n.next;
    }
  }
 public static void main(String[] args) {
    SingleList singleList =  new SingleList();
  //  singleList.head = new Node(1);
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    singleList.head = first;
    singleList.head.next = second;
    second.next = third;

  }
}
