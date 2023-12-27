import java.util.*;
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        int a = 0, b = 0, c = 0;
        int lastAdded = Integer.MIN_VALUE; // Initialize to a value that can't be in the arrays

        while (a < n1 && b < n2 && c < n3) {
            int commonElement = A[a];

            if (A[a] == B[b] && B[b] == C[c] && commonElement != lastAdded) {
                result.add(commonElement);
                lastAdded = commonElement;
            }

            // Move the pointer of the array with the smallest current element
            int min = Math.min(Math.min(A[a], B[b]), C[c]);
            if (A[a] == min) a++;
            if (B[b] == min) b++;
            if (C[c] == min) c++;
        }

        return result;
    }
}
