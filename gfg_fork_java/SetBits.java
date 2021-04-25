package gfg_fork_java;

/**
 * SetBits
 */
public class SetBits {
    // Time O(logN) | Space O(1)
    private static int countSetBitsInteger(int input) {
        int count = 0;
        while (input > 0) {
            count += input & 1;
            input >>= 1;
        }
        return count;
    }

    // Time O(logN) | Space O(logN) for function call stack
    private static int countSetBitsInteger2(int input) {
        if (input == 0)
            return 0;
        return (input & 1) + countSetBitsInteger(input >> 1);
    }

    public static void main(String[] args) {
        System.out.println(countSetBitsInteger(9));
        System.out.println(countSetBitsInteger2(9));
        System.out.println(Integer.bitCount(9));
    }
}