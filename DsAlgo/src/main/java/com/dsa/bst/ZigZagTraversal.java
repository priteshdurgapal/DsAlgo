package com.dsa.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

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

	void zigzagTraversal() {  //from chat GPT which is incorrect
		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		boolean direction = true;

		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				Node current = queue.poll();

				if (current.left != null) {
					queue.add(current.left);
				}

				if (current.right != null) {
					queue.add(current.right);
				}

				System.out.print(current.data + " ");
			}

			direction = !direction;
		}
	}

	
	List<List<Integer>> zigZag() {
		   Queue<Node> qLevel = new LinkedList<Node>();
		   List<List<Integer>> temp = new ArrayList<>();
	        qLevel.add(root);
	        boolean oneDirection = true;
	        while(!qLevel.isEmpty()) {
	        	 List<Integer> subList = new ArrayList<Integer>();
	             int size = qLevel.size();
	        	for(int i=0;i<size;i++) {
	        		Node treeNode = qLevel.poll();
	                subList.add(treeNode.data);
	                        
	                   if(treeNode.left!=null) {
	                	   qLevel.offer(root.left);
	                    }
	                        if (treeNode.right!=null) {
	                        	qLevel.offer(root.right);
	                    }
	                     
	                
	                  }
	        	temp.add(subList);
	        	oneDirection=!oneDirection;
	                   
	                }
	            

	              
					/*
					 * if(currentNode.left!=null && !oneDirection){ qLevel.add(currentNode.left); }
					 * if(currentNode.right!=null && oneDirection){ qLevel.add(currentNode.right); }
					 * 
					 * if(currentNode.left!=null && oneDirection){ qLevel.add(currentNode.left); }
					 * if(currentNode.right!=null && !oneDirection){ qLevel.add(currentNode.right);
					 * }
					 * 
					 * oneDirection=!oneDirection;
					 */
	        return temp; 
	        
	}
	
	public static void main(String args[]) {
		ZigZagTraversal tree = new ZigZagTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);
		tree.bfsTraversal();
		System.out.println();
		//System.out.println("Zigzag traversal of binary tree is chatgpt");
		//tree.zigzagTraversal();
		//System.out.println();
		System.out.println("Zigzag traversal of binary tree");
		List<List<Integer>> result = tree.zigZag();
		System.out.println(result);
		//result.stream().forEach(System.out::println);
	}

}
