package hackerrank;

import java.util.Scanner;

public class SubStringIndices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int startIndice = scanner.nextInt();
        int endIndice = scanner.nextInt();

        System.out.println(str.substring(startIndice, endIndice));
    }
}
