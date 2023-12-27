public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            }

    }

static class BinaryTreeNode{
    static int idx=-1;
    public  Node buildTree(int arr[]) {
        idx++;
        if (idx >= arr.length || arr[idx] == -1) {
            return null;
        }
        Node newNode = new Node(arr[idx]);
        newNode.left=buildTree(arr);
        newNode.right=buildTree(arr);
        return newNode;
        
    }

}
public static void main(String[] args) {
    int arr[] = {1,2,4,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTreeNode tree = new BinaryTreeNode();
     Node root =tree.buildTree(arr);
    System.out.print("In-order traversal: ");
        Transversal.inOrderTraversal(root);
        System.out.println();
    
}
}