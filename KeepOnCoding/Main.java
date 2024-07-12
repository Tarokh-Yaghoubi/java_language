package java_language.KeepOnCoding;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // each line ending with a semicolon is called a statement

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String Name = sc.nextLine();
        System.out.println("The name you have entered : " + Name);

        boolean goInIfStatement = true;
        boolean goToElseStatement = false;

        if (goToElseStatement) {
            System.out.println("You have entered a valid name");
        } else {
            System.out.println("You have entered an invalid name");
            Main.play();
        }

        Outer outer = new Outer();
        outer.test();
    }

    static void play() {
        final int unchangeable_var = 43;
        final int unchangeable_var2 = 65;
        final int unchangeable_var3 = 90;
        // final acts like a constant

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("arr length is " + arr.length);
        System.out.println("User Is Playing...");
    }
}

class Stack {
    private int[] stack;
    private int top;

    Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    boolean push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflows");
            return false;
        } else {
            top++;
            stack[top] = data;
            return true;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {

            int data = stack[top];
            top--;
            stack[top] = 0;
            return data;
        }
    }
}

// Demonstrate an Inner Class

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 34;

        void display() {
            System.out.println("outer_x is : " + outer_x);
        }
    }

    // problematic
//    void showy() {
//        System.out.println("y is : " + y);
//    }
}
