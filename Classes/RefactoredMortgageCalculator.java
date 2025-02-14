package Classes;

public class RefactoredMortgageCalculator {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT = 100;

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


}
