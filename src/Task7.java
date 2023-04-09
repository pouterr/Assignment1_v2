public class Task7 {
    /**
     * recursively reverses the elements of an integer array.
     *
     * @param arr    array to be reversed.
     * @param start starting index for the reversal.
     * @param end   ending index for the reversal.
     */
    public static void reverseArray(int[] arr, int start, int end) {
        // if the start index is greater than or equal to the end index, the array is already reversed
        if (start >= end) {
            return;
        }
        // swap elements at the start and end, and recursively reverse rest of array
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
}
