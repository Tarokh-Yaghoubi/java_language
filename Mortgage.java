
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void mortgageCalculator() {

        int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

    public static double readNumber(String prompt, int min, int max) {

        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {

            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min || value <= max)
                break;
            System.out.println("Enter a number between " + min + " and " + max);
        }

        return value;
    }

    public static double calculateMortgage(int principal,
                                           float annualInterest,
                                           byte years) {
///
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    }
}
