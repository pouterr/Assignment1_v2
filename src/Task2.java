public class Task2 {
    /**
     * Recursively finds average value from array.
     *
     * @param arr array of integers.
     * @param n array length.
     * @return average value from array.
     */
    public static double findAvg(int[] arr, int n){
        if (n == 0) {
            return 0; // Return 0 when n equals 0,so 0th element of array is the average of subarray of length 1
        } else {
            return (arr[n-1] + (n-1)*findAvg(arr, n-1)) / n; // // Calculate the average using the current element and the previous average value
        }
    }
}
