class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
      String str1 = str;
        int x = str.length();
        int y = str1.length();
        int dp [] [] = new int[x+1][y+1];
        
        for(int i =1;i<=x;i++){
            for(int j = 1;j<=y;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(str.charAt(i-1)==str1.charAt(j-1) && i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
        dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
            
        }
        return dp[x][y];
    }
    
}