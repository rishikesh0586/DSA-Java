import java.util.*;
class Demo{
    static void Intersection(int []arr,int []arr2,Set<Integer> st,Set<Integer> st2){
        for(int elem:arr){
        st.add(elem);
        }
        for(int elem:arr2){
            if(st.contains(elem)){
 st2.add(elem);
            }
    
        }
        for(int elem:st2){
 System.out.print(elem);
        }
       
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,5};
        int[] arr2={7,8,1,2,3,4,5};
       // int n=arr.length+arr2.length;
Set<Integer>st=new HashSet<>();
Set<Integer>st2=new HashSet<>();

Intersection(arr, arr2, st, st2);
for(int elem:arr){
    st.add(elem);
}
for(int elem:arr2){
    st.add(elem);
}
ArrayList<Integer>list=new ArrayList<Integer>();
for(int elem:st){
    
list.add(elem);
}
for(int elem:list){
    System.out.print(elem);
 
}
}
}