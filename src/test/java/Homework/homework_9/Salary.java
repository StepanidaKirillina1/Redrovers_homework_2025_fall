package Homework.homework_9;
/*
Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
 */

import org.junit.jupiter.api.Assertions;

public class Salary {
    public static double getSum(Employee[] employeeArray) {
        double sum = 0;

        for (Employee employee : employeeArray) {
            sum += employee.getSalary();
        }

        return sum;
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", 28, 'M', 55000.0),
                new Employee("Emma", 32, 'F', 62000.0),
                new Employee("Michael", 35, 'M', 75000.0),
                new Employee("Sophia", 29, 'F', 58000.0),
                new Employee("David", 42, 'M', 85000.0),
                new Employee("Olivia", 26, 'F', 52000.0),
                new Employee("James", 31, 'M', 68000.0),
                new Employee("Emily", 33, 'F', 71000.0),
                new Employee("William", 45, 'M', 92000.0),
                new Employee("Ava", 27, 'F', 56000.0)
        };

        Assertions.assertEquals(674000.0, getSum(employees));
    }
}
