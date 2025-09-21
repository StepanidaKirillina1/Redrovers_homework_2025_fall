package homework.homework_8;

import org.junit.jupiter.api.Assertions;

public class Salary {
    /*
    Необходимо создать класс Salary с единственным статическим методом - getSum(Employee[] employeeArray),
    метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
     */

    public static double getSum(Employee[] employeeArray) {
        double totalSum = 0;

        for (Employee employee : employeeArray) {
            totalSum += employee.getMonthlySalary();
        }

        return totalSum;
    }

    public static void main(String[] args) {
         double actualSumResult = Salary.getSum(Employee.getEmployees());

        Assertions.assertEquals(40000.0, actualSumResult);
    }
}
