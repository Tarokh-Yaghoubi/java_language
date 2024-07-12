package java_language;

import java.util.Scanner;

public class Strings {
}

class DefineStrings {
    private String str;
    private String firstName;



    void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    String getFirstName() {
        return this.firstName;
    }

    String concatStrings(String str1, String str2, String str3) {
        this.str = str1 + " " + str2 + " " + str3;
        return this.str;
    }
}

// String class has a bunch of useful methods that you can use

class TestStrings {
    public static void main(String[] args) {
        DefineStrings defineStrings = new DefineStrings();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String data = sc.nextLine();
        if (data.equals("Tarokh")) {
            System.out.println("The names match");
        } else if (!data.equals("Tarokh")) {
            System.out.println("The names do not match");
        }
        // Or simply we could use an else statement

        defineStrings.setFirstName(data);
        System.out.println("Firstname is now ---->>>> " + defineStrings.getFirstName());
    }
}