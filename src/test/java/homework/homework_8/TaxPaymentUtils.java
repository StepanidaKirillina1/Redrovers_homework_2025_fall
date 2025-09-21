package homework.homework_8;

import org.junit.jupiter.api.Assertions;

public class TaxPaymentUtils {
    /*
    Создать статический метод метод, который получит массив сотрудников,
    и вернет (или распечатает, но лучше, если вернет) массив налоговых выплат (TaxPayment) по следующему правилу:

    Если зарплата больше 10000, то налоговая ставка 23%
    Если зарплата от 5000 до 10000, то налог составляет 18%
    Если зарплата меньше 5000, то налог составляет 13%
    За каждого ребенка из зарплаты вычитается 1000, и налог берется с оставшейся суммы.
     */

    public static TaxPayment[] getEmployeeTaxes(Employee[] employees) {
        TaxPayment[] taxPayments = new TaxPayment[employees.length];

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getNumberOfChildren() > -1) {
                TaxPayment taxPayment = new TaxPayment();
                double taxSum = employees[i].getMonthlySalary() - (employees[i].getNumberOfChildren() * 1000);

                if (taxSum > 10000) {
                    taxPayment.setTaxAmount(23, taxSum);
                    taxPayment.setName(employees[i].getName());
                    taxPayments[i] = taxPayment;
                } else if (taxSum >= 5000 && taxSum <= 10000) {
                    taxPayment.setTaxAmount(18, taxSum);
                    taxPayment.setName(employees[i].getName());
                    taxPayments[i] = taxPayment;
                } else {
                    taxPayment.setTaxAmount(13, taxSum);
                    taxPayment.setName(employees[i].getName());
                    taxPayments[i] = taxPayment;
                }
            } else {
                throw new IllegalArgumentException("Please enter the value equal to or greater than 0");
            }
        }

        return taxPayments;
    }

    public static void main(String[] args) {
        TaxPayment[] taxPayments = TaxPaymentUtils.getEmployeeTaxes(Employee.getEmployees());
        double[] expectedTaxPayments = new double[]{3220.0, 1440.18, 900.0, 520.0, 649.87};
        double[] actualTaxPayments = new double[taxPayments.length];

        for (int i = 0; i < taxPayments.length; i++) {
            actualTaxPayments[i] = taxPayments[i].getTaxAmount();
        }

        Assertions.assertArrayEquals(expectedTaxPayments, actualTaxPayments);
    }
}
