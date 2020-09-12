package main.java.tasks.day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatDateTime {
    public static void main(String[] args) {
        String ourSimpleDateTime = "22.00 07.09.2020";
        SimpleDateFormat formatter = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        try {
            Date date = formatter.parse(ourSimpleDateTime);
            System.out.println(formatter.format(date));
            SimpleDateFormat formatter2 = new SimpleDateFormat("MMMM, d, YYYY HH.mm", Locale.ENGLISH);
            System.out.println(formatter2.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
