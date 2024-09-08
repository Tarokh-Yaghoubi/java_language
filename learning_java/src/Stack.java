public class Stack {
    int[] stack = new int[10];
    int top;

    Stack() {
        top = -1;
    }

    void push(int x) {
        if (top == (stack.length - 1)) {
            System.out.println("Stack Overflows");
        }

        stack[++top] = x;
    }

    // pop an item from the stack

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return stack[top--];
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < 10; i++) stack.push(i);
        for (int i = 10; i < 20; i++) stack2.push(i);

        System.out.println("Stack in stack : ");
        for (int i = 0; i < 10; i++) System.out.println(stack.pop());
        System.out.println("Stack in stack1 : ");
        for (int i = 0; i < 10; i++) System.out.println(stack2.pop());
    }
}
