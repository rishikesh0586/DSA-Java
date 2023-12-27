import java.util.*;
class ZigZag {
    

    //Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root)
    {
        //Add your code here.
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(root==null) return al;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        int num = 0;
        
        while(!q.isEmpty()){
            int qsize = q.size();
            ArrayList<Integer> al1 = new ArrayList<Integer>();
            
            for(int i=0; i<qsize; i++){
                Node curr = q.poll();
                al1.add(curr.data);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            if(num%2==0) al.addAll(al1);
            else{
                Collections.reverse(al1);
                al.addAll(al1);
            }
            num++;
        }
        return al;
    }
}