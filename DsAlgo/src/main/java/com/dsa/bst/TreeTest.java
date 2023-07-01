package com.dsa.bst;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTest {
	TreeNode root;
	static class TreeNode {
		int data;
		TreeNode right,left;
		TreeNode(int data) {
			this.data = data;
			right=left=null;
		}
	}
	
	void insert(int data) {
		
	}
	
	static int diameterCalc(TreeNode root) {
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
		
			TreeNode node = q.poll();
			System.out.println(node.data);
			
			if(node.left!=null) {
				q.add(node.left);
			}
			if(node.right!=null){
				q.add(node.right);
			}
			
		}
		return 1;
		
	}
	
	static void inorderRec(TreeNode root) {
		if(root==null) {
			return;
		}
		inorderRec(root.left);
		System.out.println(root.data);
		inorderRec(root.right);
	}
	
	static boolean childSumProp(TreeNode root) {
		int sum = 0;
		if(root==null) {
			return true;
		}
		else if(root.left ==null && root.right==null) {
			return true;
		}
	    if(root.left!=null) {
			sum += root.left.data;
		}
	    if(root.right!=null) {
			sum+=root.right.data;
		}
		return root.data == sum && childSumProp(root.left) && childSumProp(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(85);
		 root.left = new TreeNode(30);
		 root.right = new TreeNode(55);
		 root.right.left = new TreeNode(25);
		 root.right.right = new TreeNode(30);
		 
		 inorderRec(root);
		 boolean childSum = childSumProp(root);
		 System.out.println("childrenSum-->" + childSum);
		 int diameter = diameterCalc(root);

	}

}
