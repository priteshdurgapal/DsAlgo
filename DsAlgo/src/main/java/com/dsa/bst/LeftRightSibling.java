package com.dsa.bst;

import com.dsa.bst.CheckValidBST.Node;

public class LeftRightSibling {

	public void convert(Node root) {
		
		if(root==null) {
			return;
		}
		
		convert(root.left);
		convert(root.right);
		
		if(root.left==null) {
			root.left = root.right;
			root.right = null;
		} else {
			root.left.right = root.right;
			root.right = null;
		}
	}

}
