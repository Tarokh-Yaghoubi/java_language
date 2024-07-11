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
        }
    }

    void play() {
        System.out.println("User Is Playing...");
    }
}
