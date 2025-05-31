package hackerrank;
import java.util.*;
import java.text.*;

public class CurrencyFormat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + usFormat.format(amount)); // $1,234.56

        NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println("Euro: " + euroFormat.format(amount)); // 1.234,56 €

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        System.out.println("India: " + indiaFormat.format(amount)); // ₹1,234.56

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + chinaFormat.format(amount)); // ¥1,2
    }
}

