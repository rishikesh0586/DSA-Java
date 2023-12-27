
class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }
public class Trie {
     

    static Node root = new Node();

    public static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (current.children[idx] == null) {
                current.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                current.children[idx].eow = true;
            }
            current = current.children[idx];
        }
    }

    public static boolean search(String key) {
        Node current = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = current.children[idx];
            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && !node.eow) {
                return false;
            }
            current = current.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their"};
        for (String word : words) {
            insert(word);
            System.out.println(search("there"));
        }
    }
}
