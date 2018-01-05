package Microsoft;

class Node{
	int data;
	Node left;
	Node right;
	public Node(int val){
		data = val;
	}
}

public class BinaryTree{
		
		Node root;
		
		private void leftBoundary(Node root){
			if(root != null){
				if(root.left != null){
					System.out.print(root.data + " ");
					leftBoundary(root.left);
				}else if(root.right != null){
					System.out.print(root.data + " ");
					leftBoundary(root.right);
				}
			}
		}
		
		private void rightBoundary(Node root){
			if(root != null){
				if(root.right != null){
					leftBoundary(root.right);
					System.out.print(root.data + " ");
				}else if(root.left != null){
					System.out.print(root.data + " ");
					leftBoundary(root.left);
				}
			}
		}
		
		private void printLeaves(Node root){
			if(root != null){
				printLeaves(root.left);
				if(root.left == null && root.right == null){
					System.out.print(root.data + " ");
				}
				printLeaves(root.right);
			}
		}
		
		public void traverseBoundary(Node root){
			if(root != null){
				System.out.print(root.data + " ");
				leftBoundary(root.left);
				printLeaves(root.left);
				printLeaves(root.right);
				rightBoundary(root.right);
				
			}
		}
		
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.traverseBoundary(tree.root);
	}
}
	


