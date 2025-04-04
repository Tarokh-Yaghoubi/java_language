package Interfaces;

public class TaxMain {
    public static void main(String[] args) {
        var calculator = new TaxCalculator(1000);
        var report = new TaxReport(calculator);
        report.show();

        // We call this setter injection
        // report.setCalculator(new TaxCalculator2019());

        // We call this method Injection and It does not need any setter
        report.show(new TaxCalculator2019());
    }
}
