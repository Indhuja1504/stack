class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;
    
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
        System.out.println(maxSize);
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }
    
    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        }
    }

    // Method to print the stack elements
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
    
    
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        }
    }


    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);   
        stack.push(60); 
        
        // Display the stack
        stack.printStack();

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        stack.pop();
        
        // Display the stack after popping
        stack.printStack();
        System.out.println(stack.top+1);
        System.out.println("Peek"+" "+stack.peek());
        for(int i=0;i<stack.top;i++){
        System.out.println(stack.stackArray[i]);
    }}
}
