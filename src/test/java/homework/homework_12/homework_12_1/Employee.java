package homework.homework_12.homework_12_1;

public abstract class Employee {
    private String name;
    private double baseSalaryPerDay;

    public Employee(String name, double baseSalaryPerDay) {
        this.name = name;
        this.baseSalaryPerDay = baseSalaryPerDay;
    }

    public double getBaseSalaryPerDay() {
        return baseSalaryPerDay;
    }

    public void setBaseSalaryPerDay(double baseSalaryPerDay) {
        this.baseSalaryPerDay = baseSalaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getSalaryPerDay();
}
