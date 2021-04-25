package spoj.big_integer;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * julaka (https://www.spoj.com/problems/JULKA/)
 */
public class julaka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 10;
        while (t-- != 0) {
            BigInteger total = sc.nextBigInteger();
            BigInteger more = sc.nextBigInteger();
            BigInteger x = total.subtract(more).divide(BigInteger.valueOf(2));
            System.out.println(x.add(more));
            System.out.println(x);
        }
        sc.close();
    }
}