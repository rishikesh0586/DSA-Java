//visit 1  
//is string palindrome means  aba  aage piche dono traf  se same 
//method 1 we can reverse it and check
//method 2 run a loop for n/2 half of char because its enough else you can run it for
//n times also
//now check if char at i and at n-i are already
//[1,2,3,4] when i=0  ,n-i=4-0=4 it check 1,4 then 2,3 and so on
class Solution {
    int isPalindrome(String S) {
        // code here
        int output =-1;
        int n = S.length()-1;
        for(int i =0;i<=n/2;i++) {
            if(S.charAt(i)!=S.charAt(n-i)) {
                output=0;
                break;           }
                else
                output=1;
        }


        return output;
    }
};