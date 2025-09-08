package Homework.homework8;

import org.junit.jupiter.api.Assertions;

public class Person {
    /*
    Необходимо создать класс Person с полями: имя, возраст, пол.
    Класс должен иметь метод - getName,
    метод возвращает имя с префиксом “Mr. ” если пол указан как мужской
    и префикс “Mrs. ” если женский.
     */

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this("John Doe", 30, 'M');
    }

    public String getName(char gender) {
        if (gender == 'F') {
            return "Mrs. " + this.name;
        }

        if( gender == 'M') {
            return "Mr. " + this.name;
        }

        throw new IllegalArgumentException("Please enter either M or F");
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("Anna", 25, 'F');

        Assertions.assertEquals("Mr. John Doe", person.getName('M'));
        Assertions.assertEquals("Mrs. John Doe", person.getName('F'));
        Assertions.assertEquals("Mrs. Anna", person2.getName('F'));
    }
}
