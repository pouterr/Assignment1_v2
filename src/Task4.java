public class Task4 {
    /**
     * Recursively calculates the factorial of an integer n.
     *
     * @param n integer for which to find the factorial.
     * @return The factorial of the integer n.
     */
    public static int findFactorial(int n){
        //if n is 0, return 1 (0! = 1)
        if(n==0){
            return 1;
        }else{
            //calculate the factorial of n - 1 and multiply it by n
            int result = findFactorial(n-1)*n;
            return result;
        }
    }
}
