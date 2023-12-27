import java.util.*;
class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        
        int n = A.length();
        
        // Create a boolean array to store if a substring can be segmented
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // An empty string can always be segmented
        
        // Convert the wordDict list to a set for faster lookup
        Set<String> wordSet = new HashSet<>(B);
        
        // Iterate through the string
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // Check if the substring from j to i can be segmented and if the substring from j to i is in the wordDict
                if (dp[j] && wordSet.contains(A.substring(j, i))) {
                    dp[i] = true;
                    break; // If it's possible, no need to check further
                }
            }
        }
        
        return dp[n] ? 1 : 0;
   }
    }