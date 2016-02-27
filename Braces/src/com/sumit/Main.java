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
                String string = stringList.get(i);
                Stack<Character> stack = new Stack<Character>();
            for (int j = 0; j < string.length(); j++) {

                if (string.charAt(j) == '[' || string.charAt(j) == '(' || string.charAt(j) == '{') {
                    stack.push(string.charAt(j));
                } else if (string.charAt(j) == ']') {
                    if (stack.isEmpty()) result.add("NO");
                    if (stack.pop() != '[') result.add("NO");
                } else if (string.charAt(j) == '}') {
                    if (stack.isEmpty()) result.add("NO");
                    if (stack.pop() != '{') result.add("NO");
                } else if (string.charAt(j) == ')') {
                    if (stack.isEmpty()) result.add("NO");
                    if (stack.pop() != '(') result.add("NO");
                }

            }
            if (stack.isEmpty()) {
                result.add("YES");
            } else {
                result.add("NO");
            }

            }
            for(int i =0; i < result.size(); i++) {
                System.out.print(result);
            }


        }
    }
