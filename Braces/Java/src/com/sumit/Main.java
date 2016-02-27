package com.sumit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        List<String> stringList = new ArrayList<String>();
        for(int i = 0; i < testCases; i++){
            stringList.add(scan.next());

        }
        checkBraces(stringList);
    }
    public static void checkBraces(List<String> stringList) {

        List<String> result = new ArrayList<String>();
        for(int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(0);
            Stack<Character> stack = new Stack<Character>();
            for (int j = 0; j < string.length(); j++) {

                char ch = string.charAt(j);
                if (ch == '[' || ch == '(' || ch == '{') {
                    stack.push(ch);
                } else if ((ch == ']' || ch == '}' || ch == ')')
                        && (!stack.isEmpty())) {
                    if ((stack.peek() == '(' && ch == ')')
                            || (stack.peek() == '{' && ch == '}')
                            || (stack.peek() == '[' && ch == ']')) {
                        stack.pop();
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    if ((ch == ']' || ch == '}' || ch == ')')) {
                        System.out.println("NO");
                    }
                }

            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }





}
