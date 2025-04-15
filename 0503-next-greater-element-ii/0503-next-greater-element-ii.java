class Solution {
     public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);  // initialize with -1

        Stack<Integer> stack = new Stack<>();

        // Traverse the array twice to simulate circular array
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;

            while (!stack.isEmpty() && nums[index] > nums[stack.peek()]) {
                result[stack.pop()] = nums[index];
            }

            // Only push during the first pass
            if (i < n) {
                stack.push(index);
            }
        }

        return result;
    }
}