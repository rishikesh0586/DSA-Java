   import java.util.HashMap;
class Solution {
    public int findSubString( String str) {
        // Your code goes here
 

        // Create a HashMap to store the frequency of characters in the string
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // Initialize the left and right pointers of the sliding window
        int left = 0;
        int right = 0;
        
        // Initialize variables to keep track of unique characters and the minimum window length
        int uniqueChars = 0;
        int minLength = Integer.MAX_VALUE;
        
        // Traverse the string with the right pointer
        while (right < str.length()) {
            char rightChar = str.charAt(right);
            
            // Update the character count in the HashMap
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);
            
            // If the frequency of the character becomes 1, it's a unique character
            if (charCount.get(rightChar) == 1) {
                uniqueChars++;
            }
            
            // Try to minimize the window by moving the left pointer
            while (uniqueChars == charCount.size()) {
                char leftChar = str.charAt(left);
                
                // Update the minimum window length
                minLength = Math.min(minLength, right - left + 1);
                
                // Update the character count in the HashMap
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                
                // If the frequency of the character becomes 0, it's no longer in the window
                if (charCount.get(leftChar) == 0) {
                    uniqueChars--;
                }
                
                // Move the left pointer to the right
                left++;
            }
            
            // Move the right pointer to the right
            right++;
        }
        
        return minLength;
    }
    
    // public static void main(String[] args) {
    //     String s = "AABBBCBBAC";
    //     int result = smallestWindow(s);
    //     System.out.println("Smallest Window Length: " + result);
    // }
}
