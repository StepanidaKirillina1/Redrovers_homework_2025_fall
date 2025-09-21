package homework.homework_8;

public class Employee {
    /*
    Создать класс Employee ,
    в котором хранится информация о сотруднике предприятия: имя, месячная зарплата, количество детей.
     */

    private String name;
    private int monthlySalary;
    private int numberOfChildren;

    public Employee(String name, int monthlySalary, int numberOfChildren) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.numberOfChildren = numberOfChildren;
    }

    public String getName() {
        return this.name;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public static Employee[] getEmployees() {
        return new Employee[]{
                new Employee("Anna", 10001, 0),
                new Employee("John", 10001, 1),
                new Employee("Max", 5000, 0),
                new Employee("Olga", 5000, 1),
                new Employee("Ivan", 4999, 0)
        };
    }
}
