class Solution{
    public String removeConsecutiveCharacter(String S){
        StringBuilder ans = new StringBuilder();
        ans.append(S.charAt(0));
        for (int i = 0; i < S.length(); i++) {
            if (i + 1 < S.length() && S.charAt(i) != S.charAt(i + 1)) {
                ans.append(S.charAt(i + 1));
            }
        }
        return ans.toString();
    }
}