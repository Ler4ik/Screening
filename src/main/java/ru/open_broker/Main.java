package ru.open_broker;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String[] data = {"aaaa", "bbbb", "cccc", "abab", "abcabc", "aaccaab", "aabaab"};
        ArrayList<Row> rows = new ArrayList<>();

        for (String d : data) {
            rows.add(new Row(d));
        }

        System.out.println(Collections.max(rows).getValue());
    }
}
