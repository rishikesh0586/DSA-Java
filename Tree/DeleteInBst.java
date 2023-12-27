class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class DeleteInBst {

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }

        if (val < root.key) {
            root.left = delete(root.left, val);
        } else if (val > root.key) {
            root.right = delete(root.right, val);
        } else {
            // Case 1: Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node with two children
            Node inorderSuccessor = findInorderSuccessor(root.right);
            root.key = inorderSuccessor.key;
            root.right = delete(root.right, inorderSuccessor.key);
        }
        return root;
    }

    static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        System.out.println("Original Tree:");
        inorderTraversal(root);
        System.out.println();

        // Delete a node with key 30
        root = delete(root,80);

        System.out.println("Tree after deleting node with key 30:");
        inorderTraversal(root);

    }
}
