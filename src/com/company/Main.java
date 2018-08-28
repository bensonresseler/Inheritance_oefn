package com.company;

public class Main {

    public static void main(String[] args) {
        Zangeres karen = new Zangeres("Karen", "Damen");
        System.out.println(karen);
    }
}
class Zangeres extends BasisPersoon{
    public Zangeres(String voornaam, String achternaam) {
        super(voornaam, achternaam);
    }

    @Override
    public String toString() {
        return String.format("Deze zangeres heet %s %s", getVoornaam(), getAchternaam());
    }
}

class BasisPersoon{
    private String voornaam;
    private String achternaam;

    public BasisPersoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    @Override
    public String toString() {
        return String.format("Deze persoon heet %s %s", voornaam, achternaam);
    }
}