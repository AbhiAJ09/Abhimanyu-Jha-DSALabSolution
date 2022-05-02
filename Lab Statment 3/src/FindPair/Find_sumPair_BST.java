package FindPair;

import java.util.*;

class Find_sumPair_BST {
    
	//creating node of binary search tree
	static class Node {
		int data;
		Node left;
		Node right;
	};
    
	static Node NewNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}
    
	//Program to create new Node of Binary search tree
	static Node insertNode(Node root, int key) {
		
		/*
		 * If root is null
		 * this means tree is empty
		 * in this case new node will be root node 
		 */
		
		if (root == null)
			return NewNode(key);
		
		/*For Binary Search Tree
		 * if root is not empty
		 * if data is less than left root node then new node will be root left node
		 * else new node will be right node of root node
		 */
		
		if (key < root.data)
			root.left = insertNode(root.left, key);
		else
			root.right = insertNode(root.right, key);
		return root;
	}

	// Program to find pair of target sum if exist
	
	static boolean findpairUtil(Node root, int sum, HashSet<Integer> set) {
		if (root == null)
			return false;

		if (findpairUtil(root.left, sum, set))
			return true;

		if (set.contains(sum - root.data)) {
			System.out.println("Pair is  (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else
			set.add(root.data);

		return findpairUtil(root.right, sum, set);
	}

	static void findPair(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpairUtil(root, sum, set))
			System.out.print("Pairs do not exit" + "\n");
	}
}
