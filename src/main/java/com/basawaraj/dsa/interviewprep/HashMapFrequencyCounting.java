package com.basawaraj.dsa.interviewprep;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapFrequencyCounting {

    /* Problem: First Non-Repeating Character */

    public static void main(String[] args) {
        char[] array = new char[]{'a', 'a', 'b', 'c', 'c'};
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char i : array) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet() ) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }


}
