//visit 1






class Solution {
	public int addMinChar(String str1) {
		int n = str1.length();
		int start = 0;
		int end = n - 1;
		int res = 0;
		while (start < end) { // While the pointers have not met in the middle of the string
			if (str1.charAt(start) == str1.charAt(end)) { // If the characters at the start and end pointers are equal
				start++; // Move the start pointer to the right
				end--; // Move the end pointer to the left
			}
			else {
				res++; // Increment the count of characters to be added
				start = 0; // Reset the start pointer to the beginning of the string
				end = n - res - 1; // Reset the end pointer to the end of the string with a reduced number of characters
			}
		}
		return res; // Return the count of characters to be added
	}
}

class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String str = "AACECAAAA";
		System.out.println(sol.addMinChar(str));
	}
}
