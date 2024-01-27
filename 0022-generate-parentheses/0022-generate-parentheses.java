
import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        Stack<String> stack = new Stack<>();
        List<String> res = new ArrayList<>();

        // Call the helper method
        backtracking(stack, res, n, 0, 0);
        
        return res;
    }

    // Helper method for backtracking
    private void backtracking(Stack<String> stack, List<String> res, int n, int open, int close) {
        if (open == n && close == n) {
            res.add(String.join("", stack));
        } else {
            if (open < n) {
                stack.push("(");
                backtracking(stack, res, n, open + 1, close);
                stack.pop();
            }
            if (close < open) {
                stack.push(")");
                backtracking(stack, res, n, open, close + 1);
                stack.pop();
            }
        }
    }
}


