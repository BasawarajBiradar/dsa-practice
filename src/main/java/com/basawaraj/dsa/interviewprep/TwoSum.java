package com.basawaraj.dsa.interviewprep;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /* Given an array of integers arr and an integer target,
        return the indices of the two numbers such that they add up to target. */

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,7,11,15};
        Integer target = 9;
        twoSum(arr, target);
    }

    /* standard solution */
    private static void twoSum(Integer[] arr, Integer target) {

        Map<Integer, Integer> alreadySeen = new HashMap<>();

        for (int i = 0 ; i < arr.length ; i++) {
            Integer complement = target - arr[i];
            if (alreadySeen.containsKey(complement)) {
                System.out.println("indices of sum ... " + i + " // " + alreadySeen.get(target - arr[i]));
                return;
            }
            alreadySeen.put(arr[i], i);
        }
    }

    /* my solution
    private static void twoSum(Integer[] arr, Integer target) {

        Map<Integer, Integer> alreadySeen = new HashMap<>();

        for (int j = 0 ; j < arr.length ; j++)
            alreadySeen.put(arr[j], j);

        for (int i = 0 ; i < arr.length ; i++) {
            if (alreadySeen.containsKey(target - arr[i]) && alreadySeen.get(target - arr[i]) != i)
                System.out.println("indices of sum ... " + i + " // " + alreadySeen.get(target - arr[i]));
        }
    } */
}
