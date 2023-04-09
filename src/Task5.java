public class Task5 {
    /**
     * Recursively calculates the n-th number in the Fibonacci sequence.
     *
     * @param n The position of the number in the Fibonacci sequence.
     * @return The n-th number in the Fibonacci sequence.
     */
    public static int findFibSeqNumb(int n){
        //if n is 0, return 0 (0-th number in the Fibonacci sequence is 0)
        if(n == 0){
            return 0;
        //if n is 1, return 1 (1-st number in the Fibonacci sequence is 1)
        } else if (n==1) {
            return 1;
        }else{
            //calculate the sum of the (n - 1)-th and (n - 2)-th Fibonacci numbers
            int result = findFibSeqNumb(n-1)+ findFibSeqNumb(n-2);
            return result;
        }
    }
}
