package com.course.zadania_testowe.homework.pracownicy;

import com.course.zadania_testowe.homework.wycieczki.Wycieczka;
import com.course.zadania_testowe.homework.wydarzenia.WydarzenieObslugiWycieczki;

import java.util.ArrayList;
import java.util.List;

public class Przewodnik extends Pracownik {

    private List<String> listaJezykow = new ArrayList<>();
    private static List<WydarzenieObslugiWycieczki> listaWycieczek = new ArrayList<>();

    public Przewodnik(String imie, String nazwisko, String mail, int numerTelefonu, int pensja, boolean pracownikEtatowy, int liczbaPrzepracowanychGodzin, String rodzajUmowy, List<String> listaJezykow) {
        super(imie, nazwisko, mail, numerTelefonu, pensja, pracownikEtatowy, liczbaPrzepracowanychGodzin, rodzajUmowy);
        this.listaJezykow = listaJezykow;
    }

    public Przewodnik(String imie, String nazwisko, String mail, int numerTelefonu, int pensja, boolean pracownikEtatowy, List<String> listaJezykow) {
        super(imie, nazwisko, mail, numerTelefonu, pensja, pracownikEtatowy);
        this.listaJezykow = listaJezykow;
    }

    public List<String> getListaJezykow() {
        return listaJezykow;
    }

    public void setListaJezykow(List<String> listaJezykow) {
        this.listaJezykow = listaJezykow;
    }

    public static List<WydarzenieObslugiWycieczki> getListaWycieczek() {
        return listaWycieczek;
    }

    public void setListaWycieczek(List<WydarzenieObslugiWycieczki> listaWycieczek) {
        this.listaWycieczek = listaWycieczek;
    }

    @Override
    public String toString() {
        return "Przewodnik{" +
                "listaJezykow=" + listaJezykow +
//                ", listaWycieczek=" + listaWycieczek +
                '}';
    }
}
