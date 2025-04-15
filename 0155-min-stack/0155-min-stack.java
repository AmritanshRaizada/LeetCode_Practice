import java.util.Stack;

class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        long value = val;
        if (stack.isEmpty()) {
            stack.push(value);
            min = value;
        } else {
            if (value >= min) {
                stack.push(value);
            } else {

                stack.push(2 * value - min);
                min = value;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long top = stack.pop();
        if (top < min) {

            min = 2 * min - top;
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;

        long top = stack.peek();
        return (top >= min) ? (int) top : (int) min;
    }

    public int getMin() {
        return (int) min;
    }
}
