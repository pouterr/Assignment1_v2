public class Task8 {
    /**
     * recursively counts the number of non-digit characters in a character array.
     *
     * @param arr     character array.
     * @param length  current length of the character array.
     * @param counter counter to keep track of number of non-digit characters.
     * @return total count of non-digit characters in array.
     */
    public static int isDigit(char[] arr, int length, int counter) {
        // check if the length remains greater than zero, to avoid going through the array repeatedly
        if (length > 0) {
            if (Character.isDigit(arr[length])) {
                counter = isDigit(arr, length - 1, counter); // if the character is a digit, the counter remains the same
            } else {
                counter = isDigit(arr, length - 1, counter + 1); // if the character is not a digit, add 1 to the counter
            }
        }
        return counter;
    }
}
