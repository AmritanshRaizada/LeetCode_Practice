public class MaximumSubarraySum {
    public static void main(String[] args) {
        int arr[]= {1,2,3,-4,-5,6,-7,-9};
      int sum = -1 ;
      int n =arr.length;
      int maxsum=-1;
        for (int j : arr) {
            sum = sum + j;

            if (sum > maxsum) {
                maxsum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxsum);

    }
}
