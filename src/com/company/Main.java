package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> zangeressen = new ArrayList<>();

        zangeressen.add("Karen");
        zangeressen.add("Kristel");
        zangeressen.add("Kathleen");

        String tezoeken = "Kathleen";
        if (zangeressen.contains(tezoeken)){
            System.out.printf("%s staat in de eerste lijst.%n", tezoeken);
        }else{
            System.out.printf("%s staat niet in de eerste lijst.%n", tezoeken);
        }

        ArrayList<Zangeres> zangeressen2 = new ArrayList<>();

        zangeressen2.add(new Zangeres("Karen"));
        zangeressen2.add(new Zangeres("Kristel"));
        zangeressen2.add(new Zangeres("Kathleen"));

        Zangeres tezoeken2 = new Zangeres("Kathleen");
        if (zangeressen2.contains(tezoeken2)){
            System.out.printf("%s staat in de tweede lijst.%n", tezoeken2);
        }else{
            System.out.printf("%s staat niet in de tweede lijst.%n", tezoeken2);
        }
    }
}
class Zangeres{
    private String voornaam;

    public Zangeres(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    @Override
    public String toString() {
        return voornaam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zangeres zangeres = (Zangeres) o;
        return Objects.equals(voornaam, zangeres.voornaam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(voornaam);
    }
}