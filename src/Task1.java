public class Task1 {
    /**
     * Recursively finds the minimum value in an integer array
     *
     * @param arr integer array.
     * @param n   the size of array.
     * @return The minimum value found in the array.
     */
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0]; // Return the first element when n equals 1
        } else {
            int min = findMin(arr, n - 1); // Find the minimum value in the array from index 0 to n - 2
            return Math.min(min, arr[n - 1]); // Return the smaller value between the minimum value found in the subarray and the element at index n - 1
        }
    }
}

