package main.java.tasks.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogListNew {

    public static void main(String[] args) {

        String toParse = "access_log.2020.09.07 212.168.101.5 granted\n" + "access_log.2020.09.07 212.168.101.5 granted\n" + "access_log.2020.09.07 212.168.101.6 granted\n" + "access_log.2020.09.07 212.168.101.5 granted\n" + "access_log.2020.09.07 212.168.101.6 denied";

        String[] st = toParse.split("\\n");
        Pattern pattern = Pattern.compile(" (\\d+.){3}\\d.+");
        Matcher matcher = pattern.matcher(toParse);

        String[][] tempArray = new String[toParse.split("\\n").length][2];

        String[][] second = new String[st.length][2];
        for (int i = 0; i < st.length; i++) {
            String[] med = st[i].split(" ");
            second[i][0] = med[1];
            second[i][1] = med[2];
            int counter = 0;
            while (matcher.find()) {
                tempArray[counter++] = matcher.group().trim().split(" ");
            }

            Object[][] finalk = new Object[second.length][3];
            Object[][] finalArray = new Object[tempArray.length][3];

            int position = 0;
            boolean next;

            for (int j = 0; j < st.length; j++) {
                for (String[] strings : tempArray) {
                    next = false;
                    for (Object[] el : finalk) {
                        if (null != el[0] && ((String) el[0]).equalsIgnoreCase(second[j][0])) {
                            if (second[j][1].equalsIgnoreCase("granted" )) {
                                int x = (int) el[1];
                                x += 1;
                                el[1] = x;
                                for (Object[] element : finalArray) {
                                    if (null != element[0] && ((String) element[0]).equalsIgnoreCase(strings[0])) {
                                        if (strings[1].equalsIgnoreCase("granted" )) {
                                            element[1] = (int) element[1] + 1;
                                        } else {
                                            int x2 = (int) el[2];
                                            x2 += 1;
                                            el[2] = x2;
                                            element[2] = (int) element[2] + 1;
                                        }
                                        next = true;
                                    }
                                    continue;
                                }

                                    finalk[position][0] = second[j][0];
                                    if (second[j][1].equalsIgnoreCase("granted" )) {
                                        finalk[position][1] = 1;
                                        finalk[position][2] = 0;
                                        finalArray[position][0] = strings[0];
                                        if (strings[1].equalsIgnoreCase("granted" )) {
                                            finalArray[position][1] = 1;
                                            finalArray[position++][2] = 0;
                                        } else {
                                            finalk[position][1] = 0;
                                            finalk[position][2] = 1;
                                            finalArray[position][1] = 0;
                                            finalArray[position++][2] = 1;
                                        }
                                        position++;
                                    }


                                    for (Object[] el2 : finalk) {
                                        for (Object[] el3 : finalArray) {
                                            System.out.printf("ip %s: ok - %s, failed - %s%n", el3[0], el3[1], el3[2]);
                                        }

                                    }
                                }
                            }
                        }
                    }
                }}}}