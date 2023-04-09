public class Task6 {
    /**
     * Recursively calculates the result integer num to the power deg.
     *
     * @param num integer to be raised to the power of deg.
     * @param deg exponent to which the base integer num is raised.
     * @return result of num to the power of deg.
     */
    public static int findNumDegree(int num, int deg) {
        //if deg is 0, return 1 (any number raised to the power of 0 is 1)
        if (deg == 0) {
            return 1;
        } else {
            //calculate the result of raising num to the power of (deg - 1) and multiply it by num
            int result = findNumDegree(num, deg - 1) * num;
            return result;
        }
    }
}
