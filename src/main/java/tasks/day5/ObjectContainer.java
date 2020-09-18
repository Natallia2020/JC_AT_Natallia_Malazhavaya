package main.java.tasks.day5;

public class ObjectContainer {
    private Object[] container;
    private int currentPosition;

    public ObjectContainer() {
        container = new Object[10];
        currentPosition = 0;
    }

    public void add(Object o) {
        if (currentPosition < 10) {
            container[currentPosition++] = o;
        }
    }

    public Object removeLast() {
        Object result = null;
        if (currentPosition > 0) {
            result = container[currentPosition - 1];
            container[--currentPosition] = null;
        }
        return result;
    }

    public boolean isEmpty() {
        return currentPosition == 0;
    }
}
