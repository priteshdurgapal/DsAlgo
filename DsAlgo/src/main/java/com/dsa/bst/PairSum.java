package com.dsa.bst;

import java.util.HashSet;

public class PairSum {
	
	static class TreeNode {
		int item;
		TreeNode left,right;
		TreeNode(int item) {
			this.item = item;
			left=right=null;
		}
	}
	TreeNode root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(8);
		root.right = new TreeNode(40);
		root.right.left = new TreeNode(35);
		inorderPrint(root);
		boolean isPair = isPairSum(root,48);
		System.out.println(isPair);
	}
	
	static void inorderPrint(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		inorderPrint(root.left);
		System.out.println(root.item);
		inorderPrint(root.right);

	}
	
	 static boolean isPairSum(TreeNode root, int sum) {
		HashSet<Integer> sh = new HashSet<Integer>();
		
		return isPairRec(root,sum,sh);
		
	 }
	 
	 static boolean isPairRec(TreeNode node, int sum, HashSet<Integer> sh) {
		 
		 if(node==null) {
			 return false;
		 }
		 if(sh.contains(sum-node.item)) {
			 return true;
		 } else {
			 sh.add(node.item);
		 }
		 
		 if(isPairRec(node.left,sum,sh)) {
			 return true;
		 }
		 if(isPairRec(node.right,sum,sh)) {
			 return true;
		 }
		 return false;
		 
		 
	 }

}
