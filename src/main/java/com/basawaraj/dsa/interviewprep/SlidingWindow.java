package com.basawaraj.dsa.interviewprep;

public class SlidingWindow {
    /* Maximum Sum SubArray of Size K
        Find the maximum sum of any contiguous subArray of size k. */

    public static void main(String[] args) {
        Integer[] arr = {2,1,5,1,3,2};
        Integer k = 3;
        slidingWindow(arr, k);
    }

    /* standard solution */
    private static void slidingWindow(Integer[] arr, Integer k) {
        int maximumSum = 0;

        for (int i = 0 ; i < k ; i++)
            maximumSum += arr[i];

        int sum = maximumSum;

        for (int j = k ; j < arr.length; j++) {
            sum += arr[j];
            sum -= arr[j - k];

            maximumSum = Math.max(maximumSum, sum);
        }
        System.out.println(maximumSum);

    }

    /* my solution
    private static void slidingWindow(Integer[] arr, Integer k) {
        int maximumSum = 0;

        for (int i = 0 ; i <= arr.length - k ; i++) {
            int sum = 0;

            for (int j = i; j < i + k ; j++)
                sum += arr[j];

            maximumSum = Math.max(maximumSum, sum);
        }
        System.out.println(maximumSum);
    }*/

}
