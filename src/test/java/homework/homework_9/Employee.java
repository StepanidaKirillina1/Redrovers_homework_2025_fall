package homework.homework_9;
/*
Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
Класс должен иметь метод isSameName(Employee employee) который возвращает true,
если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
 */

import org.junit.jupiter.api.Assertions;

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, char gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        return this.getName().equals(employee.getName());
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee_1 =  new Employee("John", 28, 'M', 55000.0);
        Employee employee_2 = new Employee("Emma", 32, 'F', 62000.0);
        Employee employee_3 = new Employee("John", 35, 'M', 75000.0);

        Assertions.assertFalse(employee_1.isSameName(employee_2));
        Assertions.assertTrue(employee_1.isSameName(employee_3));
        Assertions.assertTrue(employee_1.isSameName(employee_1));
    }
}
