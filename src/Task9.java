public class Task9 {
    /**
     * recursively calculates the binomial coefficient C(n, k).
     *
     * @param n total number of items.
     * @param k number of items to choose from the total.
     * @return binomial coefficient C(n, k).
     */
    public static int findBinomialCoefficient(int n, int k) {
        // C(n, 0) = C(n, n) = 1
        if (k == 0 || k == n) {
            return 1;
        }
        // Add together C(n-1, k-1) and C(n-1, k) using Euclidean algorithm
        else {
            return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
        }
    }
}
