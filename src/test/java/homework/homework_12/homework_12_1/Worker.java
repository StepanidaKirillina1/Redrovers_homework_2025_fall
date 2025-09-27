package homework.homework_12.homework_12_1;

public class Worker extends Employee{
    public Worker(String name, double baseSalaryPerDay) {
        super(name, baseSalaryPerDay);
    }

    @Override
    public double getSalaryPerDay() {
        return this.getBaseSalaryPerDay();
    }
}
