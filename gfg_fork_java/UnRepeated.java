package gfg_fork_java;

import java.util.HashMap;
import java.util.Map;

/**
 * UnRepeated
 */
public class UnRepeated {
    // Time O(N) | Space O(N)
    private static int getUnrepeatedNumber(int[] inputArr) {
        Map<Integer, Integer> occuranceMap = new HashMap<>();
        for (int i = 0; i < inputArr.length; i++) {
            Integer curr = occuranceMap.getOrDefault(inputArr[i], 0);
            occuranceMap.put(inputArr[i], curr + 1);
        }
        return occuranceMap.entrySet().stream().filter(key -> key.getValue().equals(1)).map(Map.Entry::getKey)
                .findFirst().orElse(null);
    }

    // Time O(N) | Space O(1)
    private static int getUnrepeatedNumber2(int[] inputArr) {
        int result = 0;
        for (int i = 0; i < inputArr.length; i++) {
            result ^= inputArr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 2, 3 };
        System.out.println(getUnrepeatedNumber(arr));
        System.out.println(getUnrepeatedNumber2(arr));
    }
}