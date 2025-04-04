package Interfaces;


// Here TaxReport is tightly coupled to TaxCalculator cause if we
// change a single thing in TaxCalculator we need to change
// TaxReport as well.

import org.jetbrains.annotations.NotNull;

public class TaxReport {
    private CanTaxCalculator calculator;

    public TaxReport(CanTaxCalculator calculator) {

        // here, dependency injection is needed because this is not TaxReport concern
        // to create TaxCalculator object.

        // calculator = new TaxCalculator(100_000);

        // This is what we call Constructor Injection s
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public void show(@NotNull CanTaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public void setCalculator(CanTaxCalculator calculator) {
        this.calculator = calculator;
    }
}
