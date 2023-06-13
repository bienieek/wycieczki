package com.course.zadania_testowe.homework.pracownicy;

public class Manager extends Pracownik {
    int premia;

    public Manager(String imie, String nazwisko, String mail, int numerTelefonu, int pensja, boolean pracownikEtatowy, int liczbaPrzepracowanychGodzin, String rodzajUmowy, int premia) {
        super(imie, nazwisko, mail, numerTelefonu, pensja, pracownikEtatowy, liczbaPrzepracowanychGodzin, rodzajUmowy);
        this.premia = premia;
    }

    public Manager(String imie, String nazwisko, String mail, int numerTelefonu, int pensja, boolean pracownikEtatowy, int premia) {
        super(imie, nazwisko, mail, numerTelefonu, pensja, pracownikEtatowy);
        this.premia = premia;
    }

    public int getPremia() {
        return premia;
    }

    public void setPremia(int premia) {
        this.premia = premia;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "premia=" + premia +
                '}';
    }
}