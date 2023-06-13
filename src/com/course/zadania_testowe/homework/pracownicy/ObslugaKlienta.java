package com.course.zadania_testowe.homework.pracownicy;

import com.course.zadania_testowe.homework.klienci.Klient;
import com.course.zadania_testowe.homework.wycieczki.Wycieczka;
import com.course.zadania_testowe.homework.wydarzenia.WydarzenieObslugiKlienta;

import java.time.LocalDate;
import java.util.*;

public class ObslugaKlienta extends Pracownik {
    private static Map<Pracownik,Integer> rankingPracownikow = new HashMap<>();
    private Map<WydarzenieObslugiKlienta, LocalDate> datyObslugiKlienta = new HashMap<>();

    private static List<Klient> listaKlientow = new ArrayList<>();


    public ObslugaKlienta(String imie, String nazwisko, String mail, int numerTelefonu, int pensja, boolean pracownikEtatowy, int liczbaPrzepracowanychGodzin, String rodzajUmowy) {
        super(imie, nazwisko, mail, numerTelefonu, pensja, pracownikEtatowy, liczbaPrzepracowanychGodzin, rodzajUmowy);
    }

    public ObslugaKlienta(String imie, String nazwisko, String mail, int numerTelefonu, int pensja, boolean pracownikEtatowy) {
        super(imie, nazwisko, mail, numerTelefonu, pensja, pracownikEtatowy);
    }

    public static Klient klientKtoryWydalNajwiecej() {
        Klient najwiecejWydal = listaKlientow.get(0);
        for(Klient klient : listaKlientow) {
            if(Klient.wydatkiKlienta(najwiecejWydal) < Klient.wydatkiKlienta(klient)) {
                najwiecejWydal = klient;
            }
        }

        return najwiecejWydal;
    }

    public static Map<Pracownik, Integer> getRankingPracownikow() {
        return rankingPracownikow;
    }

    public static void setRankingPracownikow(Map<Pracownik, Integer> rankingPracownikow) {
        ObslugaKlienta.rankingPracownikow = rankingPracownikow;
    }

    public Map<WydarzenieObslugiKlienta, LocalDate> getDatyObslugiKlienta() {
        return datyObslugiKlienta;
    }

    public void setDatyObslugiKlienta(Map<WydarzenieObslugiKlienta, LocalDate> datyObslugiKlienta) {
        this.datyObslugiKlienta = datyObslugiKlienta;
    }

    public static List<Klient> getListaKlientow() {
        return listaKlientow;
    }

    public static void setListaKlientow(List<Klient> listaKlientow) {
        ObslugaKlienta.listaKlientow = listaKlientow;
    }

    @Override
    public String toString() {
        return "ObslugaKlienta{" +
                "datyObslugiKlienta=" + datyObslugiKlienta +
                '}';
    }
}
