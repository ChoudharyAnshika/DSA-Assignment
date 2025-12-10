public class Q20_Stack {
    private int[] stack;
    private int top;
    private int capacity;

    Q20_Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = data;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    int peek() {
        if (isEmpty()) return -1;
        return stack[top];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q20_Stack stack = new Q20_Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}