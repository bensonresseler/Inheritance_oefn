package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        MyArrayList lijst = new MyArrayList();
        lijst.add("Karen");
        lijst.add("Kristel");
        lijst.add("Kathleen");
        System.out.println(lijst);
    }
}
class MyArrayList extends ArrayList<String> {
    @Override
    public String toString() {
        String aantalNamen = "";
        for (int i = 0; i < size(); i++) {
            if (i == size()-1){
                aantalNamen += String.format("%s", get(i));
            } else {
                aantalNamen += String.format("%s;", get(i));
            }
        }
        String resultaat = "{" + aantalNamen + "}";
        return resultaat;
    }
}