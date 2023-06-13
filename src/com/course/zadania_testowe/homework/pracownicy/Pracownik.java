package com.course.zadania_testowe.homework.pracownicy;

import com.course.zadania_testowe.homework.Osoba;

public abstract class Pracownik extends Osoba {

    private int pensja;
    private final int minimalnaPensja = 3000;
    private int liczbaPrzepracowanychGodzin;
    private boolean pracownikEtatowy;
    private String rodzajUmowy;



    public Pracownik(String imie, String nazwisko, String mail, int numerTelefonu, int pensja,boolean pracownikEtatowy, int liczbaPrzepracowanychGodzin, String rodzajUmowy) {
        super(imie, nazwisko, mail, numerTelefonu);
        this.pensja = pensja;
        this.liczbaPrzepracowanychGodzin = liczbaPrzepracowanychGodzin;
        this.pracownikEtatowy = pracownikEtatowy;
        if(pracownikEtatowy) {
            this.rodzajUmowy = rodzajUmowy;
        }
    }

    public Pracownik(String imie, String nazwisko, String mail, int numerTelefonu, int pensja, boolean pracownikEtatowy) {
        super(imie, nazwisko, mail, numerTelefonu);
        this.pracownikEtatowy = pracownikEtatowy;
        this.pensja = pensja;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public int getMinimalnaPensja() {
        return minimalnaPensja;
    }

    public int getLiczbaPrzepracowanychGodzin() {
        return liczbaPrzepracowanychGodzin;
    }

    public void setLiczbaPrzepracowanychGodzin(int liczbaPrzepracowanychGodzin) {
        this.liczbaPrzepracowanychGodzin = liczbaPrzepracowanychGodzin;
    }

    public boolean isPracownikEtatowy() {
        return pracownikEtatowy;
    }

    public void setPracownikEtatowy(boolean pracownikEtatowy) {
        this.pracownikEtatowy = pracownikEtatowy;
    }

    public String getRodzajUmowy() {
        return rodzajUmowy;
    }

    public void setRodzajUmowy(String rodzajUmowy) {
        this.rodzajUmowy = rodzajUmowy;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "pensja=" + pensja +
                ", minimalnaPensja=" + minimalnaPensja +
                ", liczbaPrzepracowanychGodzin=" + liczbaPrzepracowanychGodzin +
                ", pracownikEtatowy=" + pracownikEtatowy +
                ", rodzajUmowy='" + rodzajUmowy + '\'' +
                '}';
    }
}
