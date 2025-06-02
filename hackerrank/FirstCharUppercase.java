package hackerrank;

import java.util.Scanner;

public class FirstCharUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        System.out.println(first.length() + second.length());
        int res = first.compareTo(second);
        if (res == 0) System.out.println("No");
        if (res > 0) System.out.println("Yes");
        else
            System.out.println("No");

        first = Character.toUpperCase(first.charAt(0)) + first.substring(1);
        second = Character.toUpperCase(second.charAt(0)) + second.substring(1);

        System.out.println(first + " " + second);

    }
}
