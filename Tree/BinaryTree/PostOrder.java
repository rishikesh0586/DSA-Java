import java.util.Stack;

public class PostOrder {
    

 

// Postorder (Left, Right, Root)
void postorderIterative(Node root) {
    Stack<Node> stack = new Stack<>();
    Node current = root;
    Node lastVisited = null;
    while (current != null || !stack.isEmpty()) {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.peek();
        if (current.right == null || current.right == lastVisited) {
            System.out.print(current.data + " ");
            lastVisited = stack.pop();
            current = null;
        } else {
            current = current.right;
        }
    }
}
// Postorder (Left, Right, Root)
void postorderRecursive(Node root) {
    if (root != null) {
        postorderRecursive(root.left);
        postorderRecursive(root.right);
        System.out.print(root.data + " ");
    }
}

}
