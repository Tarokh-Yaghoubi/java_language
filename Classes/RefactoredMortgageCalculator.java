package Classes;

import java.text.NumberFormat;

public class RefactoredMortgageCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;


    public RefactoredMortgageCalculator(
             int principal,
             float annualInterest,
             byte years
    ) {
        setPrincipal(principal);
        setAnnualInterest(annualInterest);
        setYears(years);
    }

    public void setPrincipal(int principal) {
        if (principal < 1_000 || principal > 1_000_000)
            throw new IllegalArgumentException("principal must be between 1000 and 1_000_000");
        this.principal = principal;
    }

    public void setAnnualInterest(float annualInterest) {
        if (annualInterest < 1 || annualInterest > 30)
            throw new IllegalArgumentException("annualInterest must be between 1 and 30");
        this.annualInterest = annualInterest;
    }

    public void setYears(byte year) {
        if (year < 1 || year > 30)
            throw new IllegalArgumentException("Year must be between 1 and 30");
        this.years = year;
    }

    public void printMortgage() {
        double mortgage = this.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = this.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    }


}
