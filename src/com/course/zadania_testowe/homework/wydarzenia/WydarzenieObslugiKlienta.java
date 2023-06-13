package com.course.zadania_testowe.homework.wydarzenia;

import com.course.zadania_testowe.homework.exceptions.KlientException;
import com.course.zadania_testowe.homework.klienci.Klient;
import com.course.zadania_testowe.homework.pracownicy.ObslugaKlienta;

import java.time.LocalDate;

public class WydarzenieObslugiKlienta {
    private Klient klient;
    private ObslugaKlienta pracownikObslugiKlienta;

    public WydarzenieObslugiKlienta(Klient klient, LocalDate dataObslugi, ObslugaKlienta pracownikObslugiKlienta) throws  KlientException {
        if (klient.isJestZarejestrowany()) {
            this.klient = klient;
            this.pracownikObslugiKlienta = pracownikObslugiKlienta;
            pracownikObslugiKlienta.getDatyObslugiKlienta().put(this,LocalDate.now());
        } else {
            throw new KlientException("Wybrany Klient jest niezarejestrowany, nie mozna go obsluzyc");
        }
    }
}
