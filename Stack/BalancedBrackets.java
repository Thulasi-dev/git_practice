// You are given a string s representing an expression containing various types of brackets: {}, (), and []. Your task is to determine whether the brackets
// in the expression are balanced. A balanced expression is one where every opening bracket has a corresponding closing bracket in the correct order.

import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Check for closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        // If the stack is not empty, there are unmatched opening brackets
        return stack.isEmpty();
    }
    
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String expression = "{[()]}";
        
        if (isBalanced(expression)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }
}
