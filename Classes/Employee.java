package Classes;

// Encapsulation: Getters and Setters

import org.jetbrains.annotations.NotNull;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        this.setBaseSalary(baseSalary);
        this.setHourlyRate(hourlyRate);
    }

    public int calculateVage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateVage() {
        return calculateVage(0);
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or less");

        this.hourlyRate = hourlyRate;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be zero or less");
        this.baseSalary = baseSalary;
    }

}
