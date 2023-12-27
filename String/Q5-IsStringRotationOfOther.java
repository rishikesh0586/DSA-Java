//visit 1
//check if string 1 is rotation of another string 2
//str1+str1 .indexof(str2)!= -1 ko return krd o
//iska mtlb str1 = abc and str2 =bca
//so abc+abc=abcabc  we can clearly see at index 1 bca is present 

class StringRotation {
	
	static boolean areRotations(String str1, String str2)
	{
		
		return (str1.length() == str2.length())
			&& ((str1 + str1).indexOf(str2) != -1);
	}

	// Driver code
	public static void main(String[] args)
	{
		String str1 = "AACD";
		String str2 = "ACDA";

		// Fuinction call
		if (areRotations(str1, str2))
			System.out.println(
				"Strings are rotations of each other");
		else
			System.out.printf(
				"Strings are not rotations of each other");
	}
}
// This code is contributed by munjal
