package com.basawaraj.dsa.interviewprep;

import java.util.Stack;

public class StackProblem {

    /* Stack — Valid Parentheses*/

    public static void main(String[] args) {
        System.out.println(validParentheses("()[{}]{}"));
    }

    private static Boolean validParentheses(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(')
                stack.push(c);
            else
            {
                char top = stack.pop();
                if (c == '}' && top != '{')
                    return false;
                if (c == ']' && top != '[')
                    return false;
                if (c == ')' && top != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }

}