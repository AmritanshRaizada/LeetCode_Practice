import java.util.Stack;

class MyQueue {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        first.push(x);
    }

    // Removes the element from in front of queue and returns that element.
    public int pop() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.pop();
    }

    // Get the front element.
    public int peek() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.peek();
    }

    // Returns whether the queue is empty.
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}
