package main.java.tasks.day10;


import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static main.java.tasks.day9.stream.Person.Sex.MAN;
import static main.java.tasks.day9.stream.Person.Sex.WOMEN;

class Person {
    String name;
    String surname;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    /* создать класс Person, с полями name, surname, age. Сгенерировать группу из 100 человек в возрасте от 15 до 30 лет.
    Написать одну непрерывную цепочку stream вызовов, которая выбирает людей, возраст которых меньше 21, выводит их имена и возраст
    в консоль, сортирует по фамилии, а потом по имени(использовать thenComparing у объекта Comparator), берет 4 первых человека,
    формирует коллекцию из имен объектов, собирает все в коллекцию
     */
    public static void main(String[] args) {
        Collection<Person> peoples = Arrays.asList(
                new Person("Вася", "Пупкин", 18),
                new Person("Инна", "Савина", 20),
                new Person("Иван", "Соколов", 22),
                new Person("Иннокентий", "Вассерман", 30),
                new Person("Валентина", "Пупкина", 27),
                new Person("Владислав", "Уваров", 16),
                new Person("Василиса", "Розумова", 15),
                new Person("Ольга", "Чемоданова", 20),
                new Person("Константин", "Савин", 30),
                new Person("Игорь", "Афинов", 27)
        );

        peoples.stream()
                .filter(p -> p.getAge()<21)
                .peek(temp -> System.out.println(temp.getName() + " " + temp.getSurname() + " " + temp.getAge()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getName)
                .peek(temp -> System.out.println(temp))
                .collect(Collectors.toList());
    }
}
