package com.dsa.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CheckCompleteBinary {

	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	Node root;
	
	void bfsTraversal() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }

            System.out.print(current.data + " ");
        }
    }

	
	void checkForCompleteBinary() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
        	
            Node current = queue.poll();
            if (current != null) {
                queue.add(current.left);
                queue.add(current.right);
            }
            else {
            	while(!queue.isEmpty()) {
            		if(queue.poll()!=null) {
            			System.out.println("false");
            		}
            	}
            }
        }
        System.out.println("true");
    }

	
	public static void main(String args[]) {
		CheckCompleteBinary tree = new CheckCompleteBinary();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		//tree.root.right.right = new Node(4);
		tree.bfsTraversal();
		System.out.println();
		//System.out.println("Zigzag traversal of binary tree is chatgpt");
		//tree.zigzagTraversal();
		//System.out.println();
		tree.checkForCompleteBinary();
		
		//result.stream().forEach(System.out::println);
	}

}
