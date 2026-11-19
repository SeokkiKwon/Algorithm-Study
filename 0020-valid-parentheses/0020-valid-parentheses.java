import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (Character c: s.toCharArray()) {

            if (stack.isEmpty() || c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                char top = stack.peek();

                if (top == '(' && c == ')'
                        || top == '{' && c == '}'
                        || top == '[' && c == ']'
                ) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty();
    }
}