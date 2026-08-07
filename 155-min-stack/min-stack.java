class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> MinStack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);

        // if stack is empty OR the top of stack is greater than val then we can push in minstack
        if (MinStack.isEmpty() || val <= (int) MinStack.peek())
            MinStack.push(val);
    }

    public void pop() {

        int poppedvalue = (int) stack.pop();

        if (poppedvalue == (int) MinStack.peek())
            MinStack.pop();
    }

    public int top() {
        return (int) stack.peek();
    }

    public int getMin() {
        return (int) MinStack.peek();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */