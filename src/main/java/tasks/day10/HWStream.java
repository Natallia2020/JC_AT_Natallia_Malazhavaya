package main.java.tasks.day10;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HWStream {
    public static void main(String[] args) {

        //для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах, певерести значения в сантиметры и найти сумму
        List <Double> inchList = new ArrayList<> ();
        for (double i = 1; i <= 20; i++) {
            inchList.add(i);
        }
        System.out.println(inchList.stream()
                .filter(o -> o%2==0)
                .peek(o -> System.out.println(o + " " + "centimeters"))
                .mapToDouble(o -> o*2.54)
                .sum());

        //сгенерировать List коллекцию целых чисел из n элементов от minValue до maxValue.
        //Определить, содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream
        List <Integer> intList = new ArrayList<>();
        Random random = new Random();
        for (int i = random.nextInt(); i < random.nextInt(); i++) {
            intList.add(random.nextInt());
        }
        System.out.println(intList.stream().
                filter(o -> o%3==0 && o%5==0)
                .findAny()
                .orElse(0));
    }
}
