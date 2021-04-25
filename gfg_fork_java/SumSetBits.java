package gfg_fork_java;

import java.util.Scanner;

/**
 * SumSetBits
 */
public class SumSetBits {

    // Time O(logn) | Space O(logn) for function in call stack
    private static int countSetBitsFrom1ToN(int n) {
        if (n == 0)
            return 0;
        int x = maxPower2InRange(n);
        int bitsTill2x = (1 << (x - 1)) * x;
        int msb2xToN = n - (1 << x) + 1;
        int rest = countSetBitsFrom1ToN(n - (1 << x));
        return bitsTill2x + msb2xToN + rest;
    }

    private static int maxPower2InRange(int n) {
        int maxPower = 0;
        while ((1 << maxPower) <= n)
            maxPower++;
        return maxPower - 1;
    }

    // Time O(n) | Space O(1)
    private static int countSetBitsFrom1ToN2(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += Integer.bitCount(i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(countSetBitsFrom1ToN(n));
        System.out.println(countSetBitsFrom1ToN2(n));
    }
}