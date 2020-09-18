package main.java.tasks.day5;

public class GenericContainerRunner
{
    public static void main(String[] args) {
        GenericContainer <Integer> container = new GenericContainer<>();
        for (int i = 0; i < 10; i++) {
            container.add(i);
        }
        System.out.println(container + "created!");
        while (!container.isEmpty()) {
            int integernumber = container.removeLast();
                System.out.println ("Number " + integernumber + " removed");
            }
        }
    }

