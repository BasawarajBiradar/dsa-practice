package com.basawaraj.dsa.interviewprep;

public class TwoPointers {
    /* Valid Palindrome
    Given a string s, return true if it reads the same forwards and backwards. */

    public static void main(String[] args) {
        System.out.println(palindrome("abccba"));
    }

    /* my solution standard solution*/
    private static Boolean palindrome(String s) {

        char[] charArray = s.toCharArray();

        for (int i = 0 ; i < charArray.length / 2 ; i++)
            if (charArray[i] != charArray[charArray.length - (i + 1)])
                return false;

        return true;
    }

}