package javaIQ;

import java.util.HashMap;


public class JavaIQ15CountDuplicatedNumbers {
    // 15. Complete countDuplicates method.
    // This method should count how many numbers are appearing more than once and should return the count.

    public static int countRepeatedElements(int[] arr) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();
        // Populate the map with frequencies
        for (int num : arr) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }
        // Count the number of elements with frequency > 1
        int count = 0;

        for (int freq : elementCountMap.values()) {
            if (freq > 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int [] numArr={12,12,13,45,78,7,7};
     int count=   countRepeatedElements(numArr);
        System.out.println(count);
    }

    }













