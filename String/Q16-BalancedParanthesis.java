
import java.util.Stack;

 class Solution {
    // Function to check if brackets are balanced or not.
     boolean ispar(String x) {
        if (x.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (char br : x.toCharArray()) {
            if (br == '{' || br == '[' || br == '(') {
                stack.push(br);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char br2 = stack.pop();
                if ((br2 == '{' && br == '}') || (br2 == '[' && br == ']') || (br2 == '(' && br == ')')) {
                    continue;
                }
                return false;
            }
        }

        return stack.isEmpty();
    }
}
