package gfg_algorithms.searching_sorting;

import java.util.Arrays;

/**
 * BinarySearch - Divide and Conquer
 */
public class BinarySearch {
    // Requires an ascending order input
    // Excluding the sorting
    // Time O(logn) | O(1)
    private static int binarySearch(int[] inputArr, int element) throws Exception {
        int head = inputArr[0], tail = inputArr[inputArr.length - 1];
        while (head < tail) {
            int middle = inputArr.length / 2;
            if (element < inputArr[middle]) {
                tail = middle;
            } else if (element > inputArr[middle]) {
                head = middle;
            } else {
                return middle;
            }
        }
        throw new Exception("Element not found");
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 45, 11, 3, 14, 114 };
        int element = 11;
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        try {
            System.out.println("Element found at index: " + binarySearch(arr, element));
        } catch (Exception e) {
            System.out.println("Element not found");
        }
    }
}