public class Task10 {
    /**
     * recursively calculates the greatest common divisor of two integers a and b.
     *
     * @param a first integer.
     * @param b second integer.
     * @return greatest common divisor of a and b.
     */
    public static int computeGcd(int a, int b) {
        // if b is zero, then the GCD is a
        if (b == 0) {
            return a;
        }
        // compute the GCD of b and the remainder of a divided by b
        else {
            return computeGcd(b, a % b);
        }
    }
}
