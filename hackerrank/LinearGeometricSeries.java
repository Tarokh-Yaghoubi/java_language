package hackerrank;

import java.util.Scanner;

public class LinearGeometricSeries {

    public static void print(int a, int b, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {

            if (i > 0) {
                temp += ((int) Math.pow(2, i)) * b;
                System.out.print(temp + " ");
            } else {
                temp = a + ((int) Math.pow(2, i)) * b;
                System.out.print(temp + " ");
            }
        }
        System.out.println();
    }

    public static void show() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; ++i) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            print(a, b, n);
        }
    }
}

class LinearGeometricSeriesDemo {
    public static void main(String[] args) {
        LinearGeometricSeries.show();
    }
}
