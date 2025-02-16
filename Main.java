
import java.text.NumberFormat;
import java.util.Scanner;

import Classes.Browser;
import Classes.Employee;
import Classes.TextBox;
import Classes.RefactoredMortgageCalculator;

public class Main {
        final static byte MONTHS_IN_YEAR = 12;
        final static byte PERCENT = 100;

        public static void main(String[] args) {
            var refactor = new RefactoredMortgageCalculator(2000, 10F, (byte) 10);
            refactor.printMortgage();
            refactor.printPaymentSchedule();
        }

        public static void main_2(String[] args) {
            int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
            float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
            byte years = (byte) readNumber("Period (Years): ", 1, 30);

            printMortgage(principal, annualInterest, years);
            printPaymentSchedule(principal, annualInterest, years);
        }

        private static void printMortgage(int principal, float annualInterest, byte years) {
            double mortgage = calculateMortgage(principal, annualInterest, years);
            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println();
            System.out.println("MORTGAGE");
            System.out.println("--------");
            System.out.println("Monthly Payments: " + mortgageFormatted);
        }

        private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
            System.out.println();
            System.out.println("PAYMENT SCHEDULE");
            System.out.println("----------------");
            for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
                double balance = calculateBalance(principal, annualInterest, years, month);
                System.out.println(NumberFormat.getCurrencyInstance().format(balance));
            }
        }

        public static double readNumber(String prompt, double min, double max) {
            Scanner scanner = new Scanner(System.in);
            double value;
            while (true) {
                System.out.print(prompt);
                value = scanner.nextFloat();
                if (value >= min && value <= max)
                    break;
                System.out.println("Enter a value between " + min + " and " + max);
            }
            return value;
        }

        public static double calculateBalance(
                int principal,
                float annualInterest,
                byte years,
                short numberOfPaymentsMade
        ) {
            float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            float numberOfPayments = years * MONTHS_IN_YEAR;

            double balance = principal
                    * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

            return balance;
        }

        public static double calculateMortgage(
                int principal,
                float annualInterest,
                byte years) {

            float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            float numberOfPayments = years * MONTHS_IN_YEAR;

            double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

            return mortgage;

        }

    // String[] args -> declares a parameter named args, which is an array of instances of the class String.
    // Arrays are collections of similar objects.

    // main() is simply a starting point for your program, a program may have dozens of classes by only one main in one of those classes.
    // Furthermore, for some types of programs, you won't need main() at all, However for most programs, main is required.

    // Console I/O is not used frequently in most real-world java applications

    private static void sum(int a, int n) {
        System.out.println(a + n);
    }

    // A "class" defines the structure and behavior (data and code)  that will be shared by a set of objects.
    // Each object of a given class contains the structure and behavior defined by the class, that is why
    // sometimes objects are called "Instances of a class".

    // When you create a class you will specify the code and data that constitute that class.
    // These elements are called members of the class.
    // The data defined by the class are called member variables, or instance variables.
    // The code that operates on that data is called member methods, or just "methods".

    // What a Java programmer calls a Method, A C programmer calls a Function.

    // In properly written Java programs the methods define how the member variables can be used.

    // Each method or variable in a class can be called "private" or "public".
    // The "public" interface of a class represents everything that external users of the class need to know, or may know.
    // The "private" methods and data can only be accessed by code that is a member of the class, Therefor any other code
    // that is not a member of the class cannot access a private method or variable.
    // ENCAPSULATION: Public methods can be used to protect private data.

    // INHERITANCE: is the process by which one object acquires the properties of another object.

    // If you want to describe a more specific class of animals, such as wolves, they would have more specific attributes, such
    // type of teeth, and color of eyes. This is known as "subclass" of animals, where animals are referred to as wolves "superclass".

    // Since wolves are simply more precisely specified animals, they inherit all the attributes of animals.

    // NOTE: A deeply inherited subclass inherits all the attributes from each of its ancestors in the "class hierarchy"


}

