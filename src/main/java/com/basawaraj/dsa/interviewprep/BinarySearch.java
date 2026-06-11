package com.basawaraj.dsa.interviewprep;

public class BinarySearch {

    /* Search in a Sorted Array
       Given a sorted array of integers nums and a target value, return the index of the target.
       If it does not exist, return -1. */

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{-1,0,3,5,9,12};
        int target = 0 ;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(Integer[] arr, Integer target) {
        int min = 0;
        int max = arr.length -1;

        while (max >= min) {
            int mid = (max + min) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                max = mid - 1;
            else
                min = mid + 1;
        }

        return -1;
    }

}