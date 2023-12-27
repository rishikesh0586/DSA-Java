
class Solution {
    public static void sort012(int a[], int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int temp;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    // Swap a[low] and a[mid], and move both pointers right
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    // No swap needed, move mid pointer right
                    mid++;
                    break;
                case 2:
                    // Swap a[mid] and a[high], and move high pointer left
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 1, 2, 0, 1, 2};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        sort012(arr, n);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    // Utility method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
