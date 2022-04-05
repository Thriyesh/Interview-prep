package com.Trees;

public class BST {

	// Constructor
	BST() {
		root = null;
	}

	BST(int value) {
		root = new Node(value);
	}

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(12);
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inOrder();
	}

	private void inOrder() {
		inOrderRec(root);
	}

	private void inOrderRec(Node root) {
		if (root!= null) {
			inOrderRec(root.left);
			System.out.println((root.key));
			inOrderRec(root.right);
		}
	}

	private void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (root.key > key) {
			root.left = insertRec(root.left, key);
		}
		if (root.key < key) {
			root.right = insertRec(root.right, key);
		}

		return root;
	}

}
