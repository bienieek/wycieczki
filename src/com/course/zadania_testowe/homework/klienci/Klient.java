package com.course.zadania_testowe.homework.klienci;

import com.course.zadania_testowe.homework.Osoba;
import com.course.zadania_testowe.homework.exceptions.KlientException;
import com.course.zadania_testowe.homework.pracownicy.ObslugaKlienta;
import com.course.zadania_testowe.homework.wycieczki.Wycieczka;

import java.util.*;

public class Klient extends Osoba {

    private boolean jestZarejestrowany;
    private int id;

    private List<Wycieczka> listaWycieczek = new ArrayList<>();


    public Klient(String imie, String nazwisko, String mail, int numerTelefonu, boolean jestZarejestrowany) {
        super(imie, nazwisko, mail, numerTelefonu);
        ObslugaKlienta.getListaKlientow().add(this);
    }

    public Klient(String imie, String nazwisko, String mail, int numerTelefonu, boolean jestZarejestrowany, int id) {
        super(imie, nazwisko, mail, numerTelefonu);
        if(jestZarejestrowany) {
            this.jestZarejestrowany = jestZarejestrowany;
            this.id = id;
            ObslugaKlienta.getListaKlientow().add(this);
        }
    }

    public static int wydatkiKlienta(Klient klient) {
        return Optional.ofNullable(klient.listaWycieczek)
                .orElseGet(Collections::emptyList)
                .stream()
                .map(Wycieczka::getCena)
                .reduce(0,Integer::sum);
    }


    public static void dodajKlienta(Klient klient, int id) throws KlientException {

        if(czyKlientJestWbazieDanych(klient)) {
            if(klient.isJestZarejestrowany()) {
                throw new KlientException("Klient jest juz zarejestrowany");
            } else {
                ObslugaKlienta.getListaKlientow().stream()
                        .filter(e -> e.equals(klient))
                        .findFirst()
                        .ifPresent(e -> {
                            e.setJestZarejestrowany(true);
                            e.setId(id);
                        });
            }

        } else {
            ObslugaKlienta.getListaKlientow().add(klient);
        }
        System.out.println(ObslugaKlienta.getListaKlientow());
    }
    public static void usunKlienta(Klient klient) throws KlientException {
        if(czyKlientJestWbazieDanych(klient)) {
            if(!klient.isJestZarejestrowany()) {
                throw new KlientException("Klient nie jest zarejestrowany");
            } else {
                ObslugaKlienta.getListaKlientow().stream()
                        .filter(e -> e.equals(klient))
                        .findFirst()
                        .ifPresent(e -> {
                            e.setJestZarejestrowany(false);
                            e.setId(0);

                        });
            }
        } else {
            throw new KlientException("Klienta nie ma w bazie danych");
        }

    }
    public static boolean czyKlientJestWbazieDanych(Klient klient) {
        return ObslugaKlienta.getListaKlientow().contains(klient);
    }

    public static List<Wycieczka> pokazWycieczkiKlienta(Klient klient) throws KlientException{
        if(czyKlientJestWbazieDanych(klient)) {
            return klient.getListaWycieczek();
        } else {
            throw new KlientException("Klienta nie ma w bazie danych");
        }
    }

    public List<Wycieczka> getListaWycieczek() {
        return listaWycieczek;
    }

    public void setListaWycieczek(List<Wycieczka> listaWycieczek) {
        this.listaWycieczek = listaWycieczek;
    }

    public boolean isJestZarejestrowany() {
        return jestZarejestrowany;
    }

    public void setJestZarejestrowany(boolean jestZarejestrowany) {
        this.jestZarejestrowany = jestZarejestrowany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "jestZarejestrowany=" + jestZarejestrowany +
                ", id=" + id +
                '}';
    }
}
