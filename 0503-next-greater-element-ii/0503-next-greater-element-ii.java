class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stack stores indices

        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];

            // Pop all elements smaller than or equal to current
            while (!stack.isEmpty() && nums[stack.peek()] <= curr) {
                stack.pop();
            }

            // If we're in the first round (i < n), store result
            if (i < n) {
                result[i] = stack.isEmpty() ? -1 : nums[stack.peek()];
            }

            // Push current index to stack
            stack.push(i % n);
        }

        return result;
    }
}
