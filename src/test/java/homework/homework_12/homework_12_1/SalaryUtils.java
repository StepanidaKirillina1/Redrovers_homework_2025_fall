package homework.homework_12.homework_12_1;

public class SalaryUtils {
    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double totalSalaryOfEmployees = 0;

        for (Employee employee : employees) {
            double employeeSalary = 0;
            for (Month month : months) {
                employeeSalary += employee.getSalaryPerDay() * month.getWorkDays();
            }
            totalSalaryOfEmployees += employeeSalary;
        }

        return totalSalaryOfEmployees;
    }
}
