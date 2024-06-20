package java_language.Classes;

// In the code below,  you can access the stack array from outside the class
// but in the future, we'll see how we can stop this.

public class Stack {

    int[] stack = new int [10];
    int top;

    Stack() {
        top = -1;
    }

    void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = item;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        Stack another_s = new Stack();
        int range = 10;
        for (int i = 0; i < range; ++i) s.push(i);
        for (int i = range; i < 20; ++i) another_s.push(i);

        System.out.println("Stack in s ---->>> ");
        for (int i = 0; i < range; ++i) System.out.println(s.pop());
        System.out.println("Stack in another s ---->>> ");
        for (int i = 0; i < range; ++i) System.out.println(another_s.pop());
    }
}
