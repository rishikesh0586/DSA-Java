//what is problem of big factorial 5! ka ans 120 
//par 10000! ka factorial bhut bada hoga use int ya long me store nehi kr skte 
//to use hm array list me store krenge kyonki hme size nhi pata
// to array ka use nhi kr skte or ek baat we use reverse because array list me
// 5! store hoga 021  ise reverse 120 is ans


import java.util.*;
class Solution {
    static ArrayList<Integer> factorial(int N){
       ArrayList<Integer> ans=new ArrayList<>();
    java.math.BigInteger factorial = java.math.BigInteger.ONE;
    //step 1 find factorial
            for (int i = 1; i <= N; i++) {
            factorial = factorial.multiply(java.math.BigInteger.valueOf(i));
        }
        //break factorial into digits and store in list
        while (!factorial.equals(java.math.BigInteger.ZERO)) {
            int rem = factorial.mod(java.math.BigInteger.TEN).intValue();
            ans.add(rem);
            factorial = factorial.divide(java.math.BigInteger.TEN);
        }
        Collections.reverse(ans);
        return ans;
    }
}