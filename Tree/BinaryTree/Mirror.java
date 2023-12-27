// Java implementation of the approach 
//import java.util.Comparator;
//it has 2 function to mirror first is  
class GFG
{

// A binary tree node has data, pointer to 
// left child and a pointer to right child 
static class node 
{ 
	int val; 
	node left; 
	node right; 
} 

// use this or use mirrorify for mirror of tree
// public static Node mirrorTree(Node root)
// {
//     if (root == null)
//         return null;
 
//     Node left = mirrorTree(root.left);
//     Node right = mirrorTree(root.right);
 
//     root.left = right;
//     root.right = left;
 
//     return root;
// }
static node createNode(int val) 
{ 
	node newNode = new node(); 
	newNode.val = val; 
	newNode.left = null; 
	newNode.right = null; 
	return newNode; 
} 

// Helper function to print Inorder traversal 
static void inorder(node root) 
{ 
	if (root == null) 
		return; 
	inorder(root.left); 
	System.out.print(root.val); 
	inorder(root.right); 
} 

// mirrorify function takes two trees, 
// original tree and a mirror tree 
// It recurses on both the trees, 
// but when original tree recurses on left, 
// mirror tree recurses on right and 
// vice-versa 
static node mirrorify(node root) 
{ 
	if (root == null) 
	{ 
		return null; 
		
	} 

	// Create new mirror node from original tree node 
	node mirror = createNode(root.val); 
	mirror.right = mirrorify(root.left); 
	mirror.left = mirrorify(root.right);
	return mirror;
} 

// Driver code 
public static void main(String args[])
{ 

	node tree = createNode(5); 
	tree.left = createNode(3); 
	tree.right = createNode(6); 
	tree.left.left = createNode(2); 
	tree.left.right = createNode(4); 

	// Print inorder traversal of the input tree 
	System.out.print("Inorder of original tree: "); 
	inorder(tree); 
	node mirror = null; 
	mirror = mirrorify(tree); 

	// Print inorder traversal of the mirror tree 
	System.out.print("\nInorder of mirror tree: "); 
	inorder(mirror); 
} 
}

// This code is contributed by Arnab Kundu
