import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // removes extra spaces
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString().trim();
    }
}
