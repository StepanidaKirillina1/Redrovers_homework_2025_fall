package homework.homework_9;
/*
    Необходимо создать класс Person с полями: имя, возраст, пол.
    Класс должен иметь метод - getName,
    метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
 */

import org.junit.jupiter.api.Assertions;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        if (Character.toLowerCase(gender) == 'm') {
            return "Mr. " + name;
        } else if (Character.toLowerCase(gender) == 'f') {
            return "Mrs. " + name;
        } else {
            throw new IllegalArgumentException("Please enter a valid gender");
        }
    }

    public static void main(String[] args) {
        Employee employee_1 =  new Employee("John", 28, 'M', 55000.0);
        Employee employee_2 = new Employee("Emma", 32, 'F', 62000.0);
        Employee employee_3 = new Employee("Sophia", 29, 'f', 58000.0);
        Employee employee_4 = new Employee("David", 42, 'm', 85000.0);

        Assertions.assertEquals("Mr. John", employee_1.getName());
        Assertions.assertEquals("Mrs. Emma", employee_2.getName());
        Assertions.assertEquals("Mrs. Sophia", employee_3.getName());
        Assertions.assertEquals("Mr. David", employee_4.getName());
    }
}
