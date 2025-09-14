package Homework.homework_10;
/*
Необходимо создать утилитарный класс со следующими методами:
●	поиск сотрудника в массиве по его имени
●	поиск сотрудника в массиве по вхождению указанной строки в его имени
●	подсчет зарплатного бюджета для всех сотрудников в массиве
●	поиск наименьшей зарплаты в массиве
●	поиск наибольшей зарплаты в массиве
●	поиск наименьшего количества подчиненных в массиве менеджеров
●	поиск наибольшего количества подчиненных в массиве менеджеров
●	поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
●	поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
 */

public class TestUtils {

    // поиск сотрудника в массиве по его имени

    public static Employee getEmployeeByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    // поиск сотрудника в массиве по вхождению указанной строки в его имени

    public static Employee getEmployeeBySubstring(Employee[] employees, String substring) {
        for (Employee employee : employees) {
            if (employee.getName().contains(substring)) {
                return employee;
            }
        }
        return null;
    }

    // подсчет зарплатного бюджета для всех сотрудников в массиве

    public static double getTotalBaseSalary(Employee[] employees) {
        double totalSum = 0;

        for (Employee employee : employees) {
            totalSum += employee.getBaseSalary();
        }

        return totalSum;
    }

    // поиск наименьшей зарплаты в массиве

    public static double getMinimalEmployeeSalary(Employee[] employees) {
        double minimalSalary = Double.MAX_VALUE;

        for (Employee employee : employees) {
            double currentEmployeeSalary = employee.getSalary();

            if (currentEmployeeSalary < minimalSalary) {
                minimalSalary = currentEmployeeSalary;
            }
        }

        return minimalSalary;
    }

    // поиск наибольшей зарплаты в массиве

    public static double getMaximumEmployeeSalary(Employee[] employees) {
        double maximumSalary = Double.MIN_VALUE;

        for (Employee employee : employees) {
            double currentEmployeeSalary = employee.getSalary();

            if (currentEmployeeSalary > maximumSalary) {
                maximumSalary = currentEmployeeSalary;
            }
        }

        return maximumSalary;
    }

    // поиск наименьшего количества подчиненных в массиве менеджеров

    public static int getLowestNumberOfSubordinatesForManagers(Manager[] managers) {
        int lowestNumberOfSubordinatesForManagers = Integer.MAX_VALUE;

        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < lowestNumberOfSubordinatesForManagers) {
                lowestNumberOfSubordinatesForManagers = manager.getNumberOfSubordinates();
            }
        }

        return lowestNumberOfSubordinatesForManagers;
    }

    // поиск наибольшего количества подчиненных в массиве менеджеров

    public static int getHighestNumberOfSubordinatesForManagers(Manager[] managers) {
        int highestNumberOfSubordinatesForManagers = Integer.MIN_VALUE;

        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > highestNumberOfSubordinatesForManagers) {
                highestNumberOfSubordinatesForManagers = manager.getNumberOfSubordinates();
            }
        }

        return highestNumberOfSubordinatesForManagers;
    }

    // поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static double getMaximumDifferenceBetweenBaseSalaryAndSalaryForManagers(Manager[] managers) {
        double maximumDifference = Double.MIN_VALUE;

        for (Manager manager : managers) {
            double differenceBetweenBaseSalaryAndSalary = manager.getSalary() - manager.getBaseSalary();

            if (manager.getSalary() - manager.getBaseSalary() > maximumDifference) {
                maximumDifference = differenceBetweenBaseSalaryAndSalary;
            }
        }

        return maximumDifference;
    }

    // поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static double getMinimumDifferenceBetweenBaseSalaryAndSalaryForManagers(Manager[] managers) {
        double minimalDifference = Double.MAX_VALUE;

        for (Manager manager : managers) {
            double differenceBetweenBaseSalaryAndSalary = manager.getSalary() - manager.getBaseSalary();

            if (manager.getSalary() - manager.getBaseSalary() < minimalDifference ) {
               minimalDifference = differenceBetweenBaseSalaryAndSalary;
            }
        }

        return minimalDifference;
    }
}
