class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int[] n = next(heights);
        int[] p = prev(heights);
        for (int i = 0; i < heights.length; i++) {
            int area= (n[i]-p[i]-1)*heights[i];
            max=Math.max(max,area);
        }
        return max ;
    }
    public int[] next(int[] arr){
        int[] nextsmol=new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1;i>=0;i--) {
            while (!stack.empty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){

                nextsmol[i]= arr.length;
            }
            else{
                nextsmol[i]=stack.peek();
            }
            stack.push(i);
        }
        return nextsmol;
    }
    public int[] prev(int[] arr){
        int[] prevsmol=new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i< arr.length;i++) {
            while (!stack.empty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){

                prevsmol[i]=-1;
            }
            else{
                prevsmol[i]=stack.peek();
            }
            stack.push(i);
        }
        return prevsmol;
    }
}