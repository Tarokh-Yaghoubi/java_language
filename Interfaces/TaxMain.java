package Interfaces;

public class TaxMain {
    public static void main(String[] args) {
        var calculator = new TaxCalculator(1000);
        var report = new TaxReport(calculator);
        report.show();
    }
}
