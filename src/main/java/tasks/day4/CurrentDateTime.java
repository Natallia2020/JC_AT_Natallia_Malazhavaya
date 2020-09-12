package main.java.tasks.day4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM, yyyy, H часа m минут");
        Date date = new Date();
        System.out.println("Сейчас на дворе:" + "\n" + dateFormat.format(date));
    }
}
