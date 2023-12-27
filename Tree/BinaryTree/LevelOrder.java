// Iterative Queue based Java program
// to do level order traversal
// of Binary Tree

import java.util.LinkedList;
import java.util.*;

// Class to represent Tree node
class Node {
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = null;
		right = null;
	}
}

// Class to print Level Order Traversal
class LevelOrder {

	Node root;

	// Given a binary tree. Print
	// its nodes in level order
	// using array for implementing queue
	void printLevelOrder()
	{
		Queue<Node> queue = new LinkedList<Node>();
        Stack<Node> s = new Stack<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {

			// poll() removes the present head. 
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");
            s.push(tempNode);

			// Enqueue left child
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			// Enqueue right child
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
           while (s.empty() == false) 
        {
            Node node = s.peek();

            System.out.println(node.data + " ");
            s.pop();
        }
	}

	public static void main(String args[])
	{
		// Creating a binary tree and entering
		// the nodes
		LevelOrder tree_level = new LevelOrder();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
		tree_level.printLevelOrder();
	}
}