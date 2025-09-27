package homework.homework_12.homework_12_1;

public class Director extends Manager {
    public Director(String name, double baseSalaryPerDay, int numberOfSubordinates) {
        super(name, baseSalaryPerDay, numberOfSubordinates);
    }

    @Override
    public double getSalaryPerDay() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalaryPerDay();
        } else {
            return getBaseSalaryPerDay() + getBaseSalaryPerDay() * (getNumberOfSubordinates() / 100.0 * 9);
        }
    }
}
