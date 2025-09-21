package homework.homework_8;

public class TaxPayment {
    /*
    Создать класс TaxPayment,
    в котором будет храниться имя сотрудника, и сумма подоходного налога, который он должен будет заплатить.
     */

    private String name;
    private int tax;

    public String getName() {
        return name;
    }

    public int getTax() {
        return tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
}
