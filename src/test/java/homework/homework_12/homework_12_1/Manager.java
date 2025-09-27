package homework.homework_12.homework_12_1;

public class Manager extends Employee{
    private int numberOfSubordinates;

    public Manager(String name, double baseSalaryPerDay, int numberOfSubordinates) {
        super(name, baseSalaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalaryPerDay() {
        if (numberOfSubordinates == 0) {
            return getBaseSalaryPerDay();
        } else {
            return getBaseSalaryPerDay() + getBaseSalaryPerDay() * (numberOfSubordinates / 100.0 * 3);
        }
    }
}
