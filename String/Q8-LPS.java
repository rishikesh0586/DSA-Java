//User function Template for Java
class Solution {
    static String longestPalin(String S) {
        int n = S.length();
        if (n < 2) {
            return S;
        }

        String longest = "";

        for (int i = 0; i < n; i++) {
            // Odd-length palindrome
            String palindrome1 = expandAroundCenter(S, i, i);
            if (palindrome1.length() > longest.length()) {
                longest = palindrome1;
            }

            // Even-length palindrome
            String palindrome2 = expandAroundCenter(S, i, i + 1);
            if (palindrome2.length() > longest.length()) {
                longest = palindrome2;
            }
        }

        return longest;
    }

    private static String expandAroundCenter(String s, int right, int left) {
        int n = s.length();

        while (left < n && right >= 0 && s.charAt(left)== s.charAt(right)  ) {
            left++;
            right--;
        }

        return s.substring(right + 1, left);
    }
}
