package com.course.zadania_testowe.homework;

import com.course.zadania_testowe.homework.exceptions.KlientException;
import com.course.zadania_testowe.homework.klienci.Klient;
import com.course.zadania_testowe.homework.pracownicy.Przewodnik;
import com.course.zadania_testowe.homework.wycieczki.Wycieczka;
import com.course.zadania_testowe.homework.wycieczki.WycieczkaKrajowa;
import com.course.zadania_testowe.homework.wydarzenia.WydarzenieObslugiWycieczki;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws KlientException {
        Klient klient1 = new Klient("Mateusz","Bieniek","mati.bienie@gmail.com",434322123,false);

        Klient.dodajKlienta(klient1,3223);
        List<String> listaJezykow = new ArrayList<>();
        listaJezykow.add("polski");
        listaJezykow.add("niemiecki");
        Klient.pokazWycieczkiKlienta(klient1);
        Wycieczka wycieczka1 = new WycieczkaKrajowa(12,3000,"Luz",4.3,"Kalisz");
        Przewodnik przewodnik1 = new Przewodnik("Maciek","Klan","mail",333222111,2321,false,listaJezykow);
        WydarzenieObslugiWycieczki wydarzenieObslugiWycieczki1 = new WydarzenieObslugiWycieczki(wycieczka1, przewodnik1, klient1);
        System.out.println(wycieczka1);
        System.out.println(przewodnik1);
        System.out.println(wydarzenieObslugiWycieczki1);
    }
}
