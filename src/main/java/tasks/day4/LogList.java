package main.java.tasks.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogList {
    public static void main(String[] args) {
        String str = "access_log.2020.09.07 212.168.101.5 granted access_log.2020.09.07 212.168.101.6 denied access_log.2020.09.07 212.168.101.5 granted access_log.2020.09.07 212.168.101.6 denied access_log.2020.09.07 212.168.101.5 denied access_log.2020.09.07 212.168.101.6 granted";
        String[] array = str.split("[a-z]{6}\\_[a-z]{3}\\.[0-9]{4}\\.[0-9]{2}\\.[0-9]{2}\\s");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        HashMap<String, Integer> ipToCount = new HashMap<>();
        for (String temp : array) {
            if (!ipToCount.containsKey(temp)) {
                ipToCount.put(temp, 0);
            }
            ipToCount.put(temp, ipToCount.get(temp) + 1);
        }
//        for (String temp : ipToCount.keySet()) {
//            System.out.println(temp + " " + ipToCount.get(temp));
//        }
        for (Map.Entry<String,Integer> temp : ipToCount.entrySet()) {
            System.out.println("ip" + " " + temp.getKey() + " " + temp.getValue());
        }
    }
}
