package gfg_fork_java;

/**
 * SubsetArraySum
 */
public class SubsetArraySum {
    private static void subsetArraySum(int[] inputArr, int requiredSum) {
        for (int i = 0; i < inputArr.length; i++) {
            int sum = 0;
            for (int j = i; j < inputArr.length; j++) {
                sum += inputArr[j];
                if (sum == requiredSum) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        subsetArraySum(new int[] { -1, 2, 4, 121 }, 5);
    }
}