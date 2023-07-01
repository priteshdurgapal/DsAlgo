package com.dsr.bst;

public class KSmallest {
	
	TreeNode root;
	
	static class TreeNode {
		int data;
		TreeNode left,right;
		 TreeNode(int data) {
			 this.data = data;
			 left=right=null;
		 }
	}
	
	static TreeNode insertRec(TreeNode root,int data) {
		
		if(root==null) {
			TreeNode node = new TreeNode(data);
			return node;
		} else if(data<root.data) {
			root.left = insertRec(root.left,data);
		}else if(data>root.data) {
			root.right = insertRec(root.right,data);
		}
		return root;
	}
	
	static void inorder(TreeNode root) {
		
		if(root!=null) {
			
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		}
	}
	
	static int count = 0;
	static TreeNode KSmallest(TreeNode root, int k) {
		
		if(root==null) {
			return null;
		}
		TreeNode left = KSmallest(root.left,k);
		if(left!=null) {
			return left;
		}
		count++;
		if(count==k) {
			return root;
		}
		return KSmallest(root.right,k);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=null;
		//insertRec(5);
		root=insertRec(root,5);
		root=insertRec(root,3);
		root=insertRec(root,6);
		root=insertRec(root,2);
		root=insertRec(root,4);
		root=insertRec(root,1);
		
		inorder(root);
		
		TreeNode node = KSmallest(root,3);
		
		System.out.println("smallest kth element-->" + node.data);
		
	}

}
