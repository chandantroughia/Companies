package Airbnb;

//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

/**
* Definition for a binary tree node.
* public class Node {
*     int val;
*     Node left;
*     Node right;
*     Node(int x) { val = x; }
* }
*/

public class SortedArraytoBST {
	
	public class Node {
		     int val;
		     Node left;
		     Node right;
		     Node(int x) { val = x; }
		 }
	
	private Node makeTree(int[] nums, int low, int high){
		if(low > high) return null;
		int mid = (low + high) / 2;
		
		Node newNode = new Node(nums[mid]);
		
		newNode.left = makeTree(nums, low, mid - 1);
		newNode.right = makeTree(nums, mid + 1, high);
		
		return newNode;
	}
	
	public Node makeBST(int[] nums){
		if(nums.length == 0) return null;
		
		Node root = makeTree(nums, 0, nums.length - 1);
		
		return root;
	}
	

}
