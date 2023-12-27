import java.util.Stack;

/**
 * Preorder
 */
public class Preorder {


// Preorder (Root, Left, Right)
void preorderIterative(Node root) {
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
        Node current = stack.pop();
        System.out.print(current.data + " ");
        if (current.right != null) {
            stack.push(current.right);
        }
        if (current.left != null) {
            stack.push(current.left);
        }
    }
}


// Preorder (Root, Left, Right)
void preorderRecursive(Node root) {
    if (root != null) {
        System.out.print(root.data + " ");
        preorderRecursive(root.left);
        preorderRecursive(root.right);
    }
}
}