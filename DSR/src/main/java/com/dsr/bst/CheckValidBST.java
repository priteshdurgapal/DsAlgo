package com.dsr.bst;

import com.dsr.bst.TreeNode;

public class CheckValidBST {
	
	//this class has naive way of adding elements in root
	//root.left or root.right
	TreeNode root;
	
	CheckValidBST(int key) {
		root = new TreeNode(key);
	}
	
	CheckValidBST() {
		root = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckValidBST treeStr = new CheckValidBST();
		treeStr.root = new TreeNode(2);
		treeStr.root.left = new TreeNode(1);
		treeStr.root.right = new TreeNode(3);
		
		
	
	}





}
