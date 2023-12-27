//Input:
// S = "timetopractice"
// P = "toc"
// Output: 
// toprac
// Explanation: "toprac" is the smallest
// substring in which "toc" can be found.
import java.util.HashMap;

class Solution
{
    public static String smallestWindow(String s, String p)
    {
        int n = s.length();
        int m = p.length();
        HashMap<Character, Integer> map = new HashMap<>();        
    //storing each character of string p in the map along with their frequencies. 

        for(int k=0; k<m; k++){
            map.put(p.charAt(k), map.getOrDefault(p.charAt(k), 0) + 1);
        }
        
        int i=0, j=0;
        String ans = "-1";
        int count = map.size();
        int len = Integer.MAX_VALUE;
        
        while(j < n){

// if we get a similar character in string s then we dec. frequency. 
//if frequncy is zero, then we dec. the count b/c we have removed all 
//the occurences of that character.

            if(map.get(s.charAt(j)) != null){
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                
                if(map.get(s.charAt(j)) == 0){
                    count--;
                }
            }
// when count becomes 0, we calculate the min. length and generate substring.

            if(count == 0){
                while(count == 0){
                    if(len > (j-i+1)){
                        len = (j-i+1);
                        ans = s.substring(i, j+1);
                  }
// now to get a better answer we shrink our window by moving i pointer. 
//since we are removing characters from window, we need to increase their 
//frequency and the count.
   
        if(map.get(s.charAt(i)) != null){
                        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                        
                        if(map.get(s.charAt(i)) > 0){
                            count++;
                        }
                    }
                    i++;
                }
            }
            j++;
        }
        return ans;
    }
}  // is this sliding window or two pointer approach