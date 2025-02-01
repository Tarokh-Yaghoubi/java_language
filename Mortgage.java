
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void mortgageCalculator() {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        int numberOfPayments = 0;
        float monthlyInterest = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Principal: ");
            principal = scanner.nextInt();

            if (principal < 1_000 || principal > 1_000_000) {
                System.out.println("Enter a valid principal between 1000 and 1000000");
                continue;
            }
            break;
        }

        while (true) {

            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest < 0 || annualInterest > 30) {
                System.out.println("Enter a number greater than 0 or lessEqual to 30: ");
                continue;
            }
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            break;
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between one and thirty: ");
        }
        
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
