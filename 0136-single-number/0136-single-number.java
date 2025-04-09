class Solution {
    public int singleNumber(int[] arr) {
          int result = 0;
        for (int num : arr) {
            result ^= num;  // XOR operation
        }
        return result;
    }
}