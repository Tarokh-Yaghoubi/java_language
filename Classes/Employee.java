package Classes;

// Encapsulation: Getters and Setters

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateVage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or less");

        this.hourlyRate = hourlyRate;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be zero or less");
        this.baseSalary = baseSalary;
    }


}
