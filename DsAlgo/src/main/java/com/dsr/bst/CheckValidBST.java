package com.dsr.bst;

public class CheckValidBST {

	// this class has naive way of adding elements in root
	// root.left or root.right
	static class Node {
		Node left, right;
		int item;

		Node(int item) {
			this.item = item;
			left = right = null;
		}

	}

	Node root;

	static void inorderPrint(Node root) {

		if (root == null) {
			return;
		}

		inorderPrint(root.left);
		System.out.println(root.item);
		inorderPrint(root.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node treeStr = new Node(2);
		// treeStr = new Node(2);
		treeStr.left = new Node(1);
		treeStr.right = new Node(3);
		inorderPrint(treeStr);

		boolean isBST = checkValid(treeStr);
		System.out.println(isBST);

	}

	static boolean checkValid(Node root) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		return checkValid(root, min, max);
	}

	static boolean checkValid(Node root, int min, int max) {
		if (root == null) {
			return true;
		}
		return (root.item > min && root.item < max && checkValid(root.left, min, root.item)
				&& checkValid(root.right, root.item, max));

	}

}
