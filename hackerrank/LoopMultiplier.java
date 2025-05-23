package hackerrank;

import java.util.Scanner;

public class LoopMultiplier {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; ++i)
            System.out.println(n + " * " + i + " = " + (n * i));
    }
}

class LoopMultiplierDemo {
    public static void main(String[] args) {
        // code
        LoopMultiplier.show();
    }
}
