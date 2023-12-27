import java.util.*;
class Demo{
    public static void main(String[] args) {
        int arr[]={1,2,3,8,45,5,5,5,6,6,6,6,7};
        HashMap<Integer, Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>(); 
        Deque<Integer>stack=new ArrayDeque<>();
        Queue<Integer>queue=new ArrayDeque<>();
        List<Integer>list=new LinkedList<>();                         
        for (int elem:arr) {
            set.add(elem);
            stack.push(elem);
            queue.add(elem);
            if(map.containsKey(elem)){
                int a =map.get(elem);
                map.put(elem,a+1);
                //mp.put(elem, mp.getOrDefault(elem,0)+1);
            }else{
                map.put(elem,0); 
            }
            
        }
        System.out.println(map);
                System.out.println(set);
                int a =stack.pop();
                int b=queue.poll();
                System.out.println(stack);
                        System.out.println("stack hai bhai"+a);
                        System.out.println(queue);
                                System.out.println("this is queue"+b);
    }
}