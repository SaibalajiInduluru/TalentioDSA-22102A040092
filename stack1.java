public class stack1 
{
    int maxSize;
    int[] stack;
    int top;

    stack1(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }


    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

   
    void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stack1 s = new stack1(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.printStack();

        System.out.println("Popped: " + s.pop());
        System.out.println("Top element: " + s.peek());
        s.printStack();
    }


    
}
