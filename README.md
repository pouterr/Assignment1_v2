# Assignment1_v2 Documentation

**Title**: *Task1 - Find Minimum Value in an Array*

**Description**: The Task1 class contains a single static method `findMin`, which finds and returns the minimum value in an integer array using a recursive approach.**
```java
public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0]; // Return the first element when n equals 1
        } else {
            int min = findMin(arr, n - 1); // Find the minimum value in the array from index 0 to n - 2
            return Math.min(min, arr[n - 1]); // Return the smaller value between the minimum value found in the subarray and the element at index n - 1
        }
    }
```

**Title**: *Task2 - Find the Average of an Array*

**Description**: The Task2 class contains a single static method findAvg, which calculates and returns the average of the elements in an integer array using a recursive approach.
```java
public static double findAvg(int[] arr, int n){
        if (n == 0) {
            return 0; // Return 0 when n equals 0,so 0th element of array is the average of subarray of length 1
        } else {
            return (arr[n-1] + (n-1)*findAvg(arr, n-1)) / n; // Calculate the average using the current element and the previous average value
        }
    }
```

**Title**: *Check if a Number is Prime using Recursion*

**Description**: The following code snippet defines a static method `isPrime`, which checks if a given integer `n` is prime or not using a recursive approach with a `divider` and a `counter`.
```java
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
```

**Title**: *Task4 - Calculate Factorial using Recursion*

**Description**: The Task4 class contains a single static method `findFactorial`, which calculates and returns the factorial of a non-negative integer using a recursive approach.
```java
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
```

**Title**: *Task5 - Calculate Fibonacci Sequence Number using Recursion*

**Description**: The Task5 class contains a single static method `findFibSeqNumb`, which calculates and returns the n-th number in the Fibonacci sequence using a recursive approach.
```java
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
```

**Title**: *Task6 - Calculate Integer Exponentiation using Recursion*

**Description**: The Task6 class contains a single static method `findNumDegree`, which calculates and returns the result of raising an integer `num` to the power of another integer `deg` using a recursive approach.
```java
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
```

**Title**: *Task7 - Reverse an Array using Recursion*

**Description**: The Task7 class contains a single static method `reverseArray`, which reverses the elements of an integer `array` in place using a recursive approach.
```java
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
```

**Title**: *Task8 - Count Non-digit Characters in a Character Array using Recursion*

**Description**: The Task8 class contains a single static method `isDigit`, which recursively counts and returns the number of non-digit characters in a character array.
```java
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
```

**Title**: *Task9 - Calculate Binomial Coefficient using Recursion*

**Description**: The Task9 class contains a single static method `findBinomialCoefficient`, which calculates and returns the binomial coefficient `C(n, k)` using a recursive approach.
```java
public static int findBinomialCoefficient(int n, int k) {
        // C(n, 0) = C(n, n) = 1
        if (k == 0 || k == n) {
            return 1;
        }
        // Add together C(n-1, k-1) and C(n-1, k)
        else {
            return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
        }
    }
```

**Title**: *Task10 - Calculate the Greatest Common Divisor (GCD) using Recursion*

**Description**: The Task10 class contains a single static method `computeGcd`, which calculates and returns the greatest common divisor (GCD) of two integers `a` and `b` using the recursive Euclidean algorithm.
```java
public static int findBinomialCoefficient(int n, int k) {
        // C(n, 0) = C(n, n) = 1
        if (k == 0 || k == n) {
            return 1;
        }
        // Add together C(n-1, k-1) and C(n-1, k)
        else {
            return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
        }
    }
```
