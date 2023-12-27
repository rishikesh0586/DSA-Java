//note we can not use sliding window for this because
//1 3 4 2 5   iska ans 12 345  hoga 
//sliding window ka use tab kr skte hai jab lagatar ho jaise consequtive  sequence
//so now use hashmap or hashset


import java.util.*;
class Demo{
    static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Set<Integer> set = new HashSet<>();
	   for(int i=0;i<N;i++){
	       set.add(arr[i]);
	   }
	   int num = 0;
	   int count = 0;
	   int maxi = Integer.MIN_VALUE;
	   for(int i=0;i<N;i++){
	       if(!set.contains(arr[i]-1)){
	           num = arr[i];
	           while(set.contains(num)){
	               num++;
	               count++;
	           }
	           maxi = Math.max(maxi,count);
	           count = 0;
	       }
	   }
	   return maxi;
	}
}