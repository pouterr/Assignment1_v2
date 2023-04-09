public class Task3 {
    /**
     * Recursively checks if a given integer n is prime or not.
     *
     * @param n User chosen number.
     * @param divider Divider which divides user number.
     * @param counter Counter for divisors of n
     * @return counter value when all divisors have been checked
     */
    public static int isPrime(int n,int divider,int counter){
        // As divider starts from 2, it checks for n = 1 and n = 2
        if(n==divider || n<divider){
            return counter;
        }else{
            // When divider is divides n counter is being added 1
            if(n%divider==0){
                return counter+1;
            }else{
                // Checking with the next divider by adding 1
                return isPrime(n,divider+1,counter);
            }
        }
    }

}
