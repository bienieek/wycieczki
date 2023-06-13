package com.course.zadania_testowe.homework.wydarzenia;

import com.course.zadania_testowe.homework.klienci.Klient;
import com.course.zadania_testowe.homework.pracownicy.Przewodnik;
import com.course.zadania_testowe.homework.wycieczki.Wycieczka;

public class WydarzenieObslugiWycieczki {
    private Wycieczka wycieczka;
    private Przewodnik przewodnik;
    private Klient klient;

    public WydarzenieObslugiWycieczki(Wycieczka wycieczka, Przewodnik przewodnik, Klient klient) {
        this.wycieczka = wycieczka;
        this.przewodnik = przewodnik;
        this.klient = klient;
        klient.getListaWycieczek().add(wycieczka);
        Przewodnik.getListaWycieczek().add(this);
    }

    public Wycieczka getWycieczka() {
        return wycieczka;
    }

    public Przewodnik getPrzewodnik() {
        return przewodnik;
    }

    @Override
    public String toString() {
        return "WydarzenieObslugiWycieczki{" +
                "wycieczka=" + wycieczka +
                ", przewodnik=" + przewodnik +
                '}';
    }
}
