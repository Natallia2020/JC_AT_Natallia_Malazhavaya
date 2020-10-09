package main.java.tasks.day9.stream;

import java.util.Arrays;
import java.util.List;

import static main.java.tasks.day9.stream.Person.Sex.*;

public class Person {
    public String name;
    public int age;
    public Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public enum Sex {
        MAN, WOMEN
    }
}
class Runner {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Вася", 13, MAN),
                new Person("Катя", 28, WOMEN),
                new Person("Вова", 24, MAN),
                new Person("Маша", 38, WOMEN),
                new Person("Роман Петрович", 32, MAN)
        );
        System.out.println(list.stream().filter(person -> (person.sex == WOMEN && person.age >= 18 && person.age <= 55) ||
                (person.sex == MAN && person.age >= 18 && person.age <= 60)).count());

    }
}

