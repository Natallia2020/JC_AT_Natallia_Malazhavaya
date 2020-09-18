package main.java.tasks.day5;

import java.util.Random;

public class ObjectContainerRunner
{
    public static void main(String[] args) {
        ObjectContainer container = new ObjectContainer();
        for (int i = 0; i < 10; i++) {
            container.add(i);
            container.add("String");
        }
        System.out.println(container + "created!");
        while (!container.isEmpty()) {
            Object object = container.removeLast();
            if (object instanceof Integer) {
                int integer = ((Integer) object);
                System.out.println ("Number " + integer + " removed");
            }
        }
    }
}
