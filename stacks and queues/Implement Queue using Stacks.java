class MyQueue {
    Stack < Integer > input = new Stack < > ();
    Stack < Integer > output = new Stack < > ();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        //System.out.println("The element pushed is " + x);
        input.push(x);
    }
    
    public int pop() {
        if (output.empty())
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }


        int x = output.peek();
        output.pop();
        return x;
    }
    
    public int peek() {
        if (output.empty())
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }
        return output.peek();
    }
    
    public boolean empty() {
        return input.empty() && output.empty();
    }
}
