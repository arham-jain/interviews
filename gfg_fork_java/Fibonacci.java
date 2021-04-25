package gfg_fork_java;

/**
 * Fibonacci
 */
public class Fibonacci {
    // Time O(2^N) | Space O(N) for function call stack
    private static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Time O(N) | Space O(1)
    private static void printFibonacciSeries(int n) {
        int prev = 1, prePrev = 0;
        System.out.printf("%d %d ", prePrev, prev);
        for (int i = 2; i <= n; i++) {
            int current = prev + prePrev;
            System.out.printf("%d ", current);
            prePrev = prev;
            prev = current;
        }
    }

    // There is a O(logN) solution, matrix method and formula based

    public static void main(String[] args) {
        // System.out.println(fibonacci(9));
        printFibonacciSeries(9);
    }
}