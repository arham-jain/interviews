package gfg_fork_java;

/**
 * Arrays
 */
public class Arrays {
    private static void basicArray() {
        int[] array = { 1, 2, 3, 4 };
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    private static void jaggedArray() {
        int[][] jaggedArray = { new int[] { 1 }, new int[] { 1, 2 }, new int[] { 1, 2, 3 } };
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.printf("%d ", jaggedArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // basicArray();
        jaggedArray();
    }
}