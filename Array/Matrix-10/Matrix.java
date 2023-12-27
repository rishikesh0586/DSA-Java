public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;
        boolean found = linearSearch(matrix, target);

        if (found) {
            System.out.println("Element found in the matrix.");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }

    public static boolean linearSearch(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    return true; // Element found
                }
            }
        }

        return false; // Element not found
    }
}
