package main.java.tasks.day10;

import main.java.tasks.day9.stream.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static main.java.tasks.day9.stream.Person.Sex.MAN;
import static main.java.tasks.day9.stream.Person.Sex.WOMEN;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("мыла", "раму", "мама", "чисто");
        List<Person> list2 = Arrays.asList(
                new Person("Вася", 13, MAN),
                new Person("Катя", 28, WOMEN),
                new Person("Вова", 24, MAN),
                new Person("Маша", 38, WOMEN),
                new Person("Роман Петрович", 32, MAN)
        );
        // отсортировать коллекцию строк по алфавиту
        System.out.println(list1.stream().sorted().collect(Collectors.toList()));
        // отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
        System.out.println(list1.stream().sorted((o1, o2) -> -o1.compareTo(o2)).distinct().collect(Collectors.toList()));
        // отсортировать коллекцию людей сначала по полу, потом по возрасту, вывести результат в консоль и вернуть результатирующую коллекцию
        // Way1
        list2.stream().sorted((o1, o2) -> {
            if (o1.sex != o2.sex) {
                return o1.sex.compareTo(o2.sex);
            }
            return o1.age - o2.age;
        }).peek(person -> System.out.println(person.name)).collect(Collectors.toList());
        // Way2
        list2.stream().sorted(
                (o1, o2) -> o1.sex != o2.sex ? o1.sex.compareTo(o2.sex) : o1.age - o2.age)
                .peek(person -> System.out.println(person.name))
                .collect(Collectors.toList());
        //разделить слова по символам, отпечатать результат, выбрать символ с максимальным значением среди букв
        list1.stream().flatMap(s -> Arrays.stream(s.split("")))
                .peek(System.out::println)
                .max(String::compareTo)
                .get();
        //найти человека с минимальным возрастом
        System.out.println(list2.stream().min(Comparator.comparingInt(person -> person.age)).get());
        // найти сумму общего количества букв во всех словах коллекции
        //1 Way
        System.out.println(list1.stream().map(String::length).reduce((s1, s2) -> s1 + s2).get());
        //2 way
        System.out.println(list1.stream().mapToInt(String::length).sum());
        //3 Way
        System.out.println(list1.stream().flatMap(s -> Arrays.stream(s.split(""))).count());
        // найти количество букв, из которых состоят слова с нечетным количеством букв
        System.out.println(list1.stream().map(String::length).collect(Collectors.summingInt(i -> i%2==1 ?  i : 0)));
        // объединить все элементы в одну строку через разделитель : и обернуть тегами <p> ... </p>
        System.out.println(list1.stream().collect(Collectors.joining(":", "<p>", "</p>")));
        // преобразовать people в map, где ключом является hash объекта, а значением сам объект Person
        System.out.println(list1.stream().collect(Collectors.toMap(person -> person.hashCode(), person -> person)));
        // преобразовать people в map, сгруппировав по полу и вывести в консоль ключи
        list2.stream().collect(Collectors.groupingBy(person -> person.sex)).keySet().forEach(System.out::println);
    }
}


