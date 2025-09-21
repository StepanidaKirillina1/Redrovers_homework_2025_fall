package homework.homework_10;
/*
Необходимо создать класс Employee со следующими методами:
●	getBaseSalary - получить базовую ставку
●	setBaseSalary
●	getName - получить имя
●	setName
●	getSalary - получить зарплату


Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.

Необходимо создать класс Manager в который нужно добавить следующие методы:
●	getNumberOfSubordinates - получить количество подчиненных
●	setNumberOfSubordinates

 в классе, метод getSalary будет возвращать значение по формуле -
 <базовая ставка> * (<количество подчиненных> / 100 * 3).
 Если количество подчиненных 0, то результат как у обычного рабочего.

Необходимо создать класс Director с теми же методами, что и Manager,
но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
Если количество подчиненных 0, то результат как у обычного рабочего.
 */

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return baseSalary;
    }
}
