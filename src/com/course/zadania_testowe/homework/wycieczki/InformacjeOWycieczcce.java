package com.course.zadania_testowe.homework.wycieczki;

public class InformacjeOWycieczcce {
    private String ograniczenia;
    private String uwagiDoWycieczki;
    private Wycieczka wycieczka;

    public InformacjeOWycieczcce(String ograniczenia, String uwagiDoWycieczki, Wycieczka wycieczka) {
        this.ograniczenia = ograniczenia;
        this.uwagiDoWycieczki = uwagiDoWycieczki;
        this.wycieczka = wycieczka;
    }

    public String getOgraniczenia() {
        return ograniczenia;
    }

    public void setOgraniczenia(String ograniczenia) {
        this.ograniczenia = ograniczenia;
    }

    public String getUwagiDoWycieczki() {
        return uwagiDoWycieczki;
    }

    public void setUwagiDoWycieczki(String uwagiDoWycieczki) {
        this.uwagiDoWycieczki = uwagiDoWycieczki;
    }

    public Wycieczka getWycieczka() {
        return wycieczka;
    }


    public void setWycieczka(Wycieczka wycieczka) {
        this.wycieczka = wycieczka;
    }

    @Override
    public String toString() {
        return "InformacjeOWycieczcce{" +
                "ograniczenia='" + ograniczenia + '\'' +
                ", uwagiDoWycieczki='" + uwagiDoWycieczki + '\'' +
                ", wycieczka=" + wycieczka +
                '}';
    }

}
