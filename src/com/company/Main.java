package com.company;

public class Main {

    public static void main(String[] args) {
            BankRekening rekening = new BankRekening();
            Klant karen = new Klant("Karen", "Damen",rekening);
        }
    }

    class Klant extends BasisPersoon {
        private BankRekening rekening;

        public Klant(String voornaam, String achternaam, BankRekening rekening) {
            super(voornaam, achternaam);
            this.rekening = rekening;
        }
    }

    class BankRekening{
        private int saldo;
        public int getSaldo(){
            return saldo;
        }
        public void storten(int bedrag){
            saldo += bedrag;
        }
        public void afhalen(int bedrag){
            saldo -= bedrag;
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
        public void setVoornaam(String voornaam) {
            this.voornaam = voornaam;
        }
        public String getAchternaam() {
            return achternaam;
        }
        public void setAchternaam(String achternaam) {
            this.achternaam = achternaam;
        }
    }