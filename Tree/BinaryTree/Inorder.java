import java.util.Stack;

public class Inorder {
       // Inorder (Left, Root, Right)
void inorderIterative(Node root) {
    Stack<Node> stack = new Stack<>();
    Node current = root;
    while (current != null || !stack.isEmpty()) {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        System.out.print(current.data + " ");
        current = current.right;
    }
}
        // Inorder (Left, Root, Right)
void inorderRecursive(Node root) {
    if (root != null) {
        inorderRecursive(root.left);
        System.out.print(root.data + " ");
        inorderRecursive(root.right);
    }
}

}
