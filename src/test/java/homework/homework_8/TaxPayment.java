package homework.homework_8;

public class TaxPayment {
    /*
    Создать класс TaxPayment,
    в котором будет храниться имя сотрудника, и сумма подоходного налога, который он должен будет заплатить.
     */

    private String name;
    private double taxAmount;

    public String getName() {
        return name;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxAmount(int tax, double salary) {

        this.taxAmount = salary * tax / 100;
    }
}
