class Solution {
    public boolean verifyJobNesting(String tape) {
        Stack<Character> stack = new Stack<>();

        for (char c : tape.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') return false;
                    stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') return false;
                    stack.pop();
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.peek() != '{') return false;
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
