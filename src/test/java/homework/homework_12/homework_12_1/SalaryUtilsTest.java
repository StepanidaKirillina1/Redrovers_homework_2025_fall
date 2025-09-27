package homework.homework_12.homework_12_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalaryUtilsTest {
    private Employee manager;
    private Employee director;
    private Employee worker;
    private Employee[] employees;

    @BeforeEach
    void setUp() {
        manager = new Manager("Anna", 50.0, 1);
        director = new Director("John", 65.0, 10);
        worker = new Worker("Ivan", 25.0);
        employees = new Employee[]{manager, director, worker};
    }

    @Test
    public void testTotalSalaryOfEmployeesForYear() {
        Assertions.assertEquals(49600.0, SalaryUtils.getTotalSalary(employees, MonthUtils.getAllMonths()));
    }

    @Test
    public void testTotalSalaryOfEmployeesForFirstHalfOfYear() {
        Assertions.assertEquals(23800.0, SalaryUtils.getTotalSalary(employees, MonthUtils.getMonthsOfFirstHalfOfYear()));
    }

    @Test
    public void testTotalSalaryOfEmployeesForSecondHalfOfYear() {
        Assertions.assertEquals(25800.0, SalaryUtils.getTotalSalary(employees, MonthUtils.getMonthsOfSecondHalfOfYear()));
    }
}
