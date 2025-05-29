package hackerrank;

/**
 *
 *  We use static initialization block when:
 *      1 - When initialization requires exception handling
 *      2 - When initialization is multi-step and complex
 *      3 - When you need to initialize static fields that depend on each other
 *      4 - When you want to ensure initialization happens exactly once when class loads
 *      5 - For resource loading that should happen at class loading time
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializationBlock {
    private static int H;
    private static int B;
    static boolean flag = true;

    // static initialization block
    static {
        Scanner scanner = new Scanner(System.in);
        H = scanner.nextInt();
        B = scanner.nextInt();

        if (H > 0 && B > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}