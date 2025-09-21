package homework.homework_10;

import org.junit.jupiter.api.Assertions;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Anna", 1000);
        Manager manager_1 = new Manager("Anna", 1000, 5);
        Manager manager_2 = new Manager("Ivan", 2000, 0);
        Director director_1 = new Director("John", 5000, 15);
        Director director_2 = new Director("Sophia", 5000, 0);

        Assertions.assertEquals(1000, worker.getSalary());
        Assertions.assertEquals(1150.0, manager_1.getSalary());
        Assertions.assertEquals(2000, manager_2.getSalary());
        Assertions.assertEquals(11750.0, director_1.getSalary());
        Assertions.assertEquals(5000, director_2.getSalary());

        Employee[] employees = {
                new Employee("John", 4000.0),
                new Employee("Emma", 3200.0),
                new Employee("Michael", 3500.0),
                new Employee("Sophia", 2950.0),
                new Employee("David", 4214.0),
                new Employee("Olivia", 2667.0),
                new Employee("James", 3897.0),
                new Employee("Emily", 3380.0),
                new Employee("William", 549.0)
        };

        Manager[] managers = {
                new Manager("John", 4000.0, 8),
                new Manager("Emma", 3200.0, 1),
                new Manager("Michael", 3500.0, 18),
                new Manager("Sophia", 2950.0, 7),
        };

        Assertions.assertEquals("Emma", TestUtils.getEmployeeByName(employees, "Emma")
                .getName());
        Assertions.assertEquals("Olivia", TestUtils.getEmployeeBySubstring(employees, "liv")
                .getName());
        Assertions.assertEquals(28357.0, TestUtils.getTotalBaseSalary(employees));
        Assertions.assertEquals(549.0, TestUtils.getMinimalEmployeeSalary(employees));
        Assertions.assertEquals(4214.0, TestUtils.getMaximumEmployeeSalary(employees));

        Assertions.assertEquals(1, TestUtils.getLowestNumberOfSubordinatesForManagers(managers));
        Assertions.assertEquals(18, TestUtils.getHighestNumberOfSubordinatesForManagers(managers));

        Assertions.assertEquals(96.0, TestUtils.getMinimumDifferenceBetweenBaseSalaryAndSalaryForManagers(managers));
        Assertions.assertEquals(1890.0, TestUtils.getMaximumDifferenceBetweenBaseSalaryAndSalaryForManagers(managers));
    }
}
