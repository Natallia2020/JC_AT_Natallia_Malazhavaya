package main.java.tasks.day9.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        // 1 Way
        System.out.println(list.stream().filter(x -> x.equals("мама")).count());
        // 2 Way
        System.out.println(list.stream().filter("мама"::equals).count());
//        list.stream().filter(x -> {
//            return 1 == 1;
//        });
        //вернуть 1-ый элемент или "мама", если коллекция пуста
        System.out.println(list.stream().findFirst().orElse("мама"));
        //вернуть 1-ый элемент равный "мама"
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());
        //вернуть 5-ый эл-т коллекции по порядку
        System.out.println(list.stream().skip(4).findFirst().get());
        //вернуть два элемента начиная с третьего
        for (Object temp : list.stream().skip(2).limit(2).toArray()) {
            System.out.println(temp);
        }
        //выбрать уникальные строки содержащие "м"
        System.out.println(list.stream().filter((s) -> s.contains("м")).collect(Collectors.toList()));
        //найти существуют ли хоть один "мама" элемент в коллекции
        System.out.println(list.stream().anyMatch("мама"::equals));
        //найти есть ли символ "м" у всех элементов колеекции
        System.out.println(list.stream().allMatch((s) -> s.contains("м")));
        //добавить "м" в конец каждого элемента
        for (Object temp : list.stream().map((s) -> s + "м").collect(Collectors.toList())) {
            System.out.println(temp);
        }
        //разделить все слова из коллекции по букве а, убрать пустые элементы и собрать в новую коллекцию
        for (Object temp : list.stream().flatMap(s -> Arrays.asList(s.split("м")).stream().filter(s2 -> !s2.equals(""))).toArray(String[] :: new)) {
            System.out.println(temp);
        }
    }
}
