package com.buyalskaya.locale.main;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 — английский, 2 — русский, 3 — корейский, любой — английский");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (i) {
            case '1':
                country = "US";
                language = "en";
                break;
            case '2':
                country = "RU";
                language = "ru";
                break;
            case '3':
                country = "KR";
                language = "ko";
                break;
        }
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("property.message", current);
        String s1 = rb.getString("label");
        System.out.println(s1);
        String s2 = rb.getString("button");
        System.out.println(s2);
    }
}