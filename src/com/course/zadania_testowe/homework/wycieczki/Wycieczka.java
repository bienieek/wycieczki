package com.course.zadania_testowe.homework.wycieczki;

public abstract class Wycieczka {
    private int id;
    private int cena;
    private String motywWycieczki;
    private double ocenaWycieczki;
    private InformacjeOWycieczcce informacjeOWycieczce;

    public Wycieczka(int id, int cena, String motywWycieczki, double ocenaWycieczki) {
        this.id = id;
        this.cena = cena;
        this.motywWycieczki = motywWycieczki;
        this.ocenaWycieczki = ocenaWycieczki;
    }

    public void dodajInformacjeOWycieczce(String ograniczenia,String uwagiDoWycieczki) {
        this.informacjeOWycieczce = new InformacjeOWycieczcce(ograniczenia, uwagiDoWycieczki, this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getMotywWycieczki() {
        return motywWycieczki;
    }

    public void setMotywWycieczki(String motywWycieczki) {
        this.motywWycieczki = motywWycieczki;
    }

    public double getOcenaWycieczki() {
        return ocenaWycieczki;
    }

    public void setOcenaWycieczki(double ocenaWycieczki) {
        this.ocenaWycieczki = ocenaWycieczki;
    }

    @Override
    public String toString() {
        return "Wycieczka{" +
                "id=" + id +
                ", cena=" + cena +
                ", motywWycieczki='" + motywWycieczki + '\'' +
                ", ocenaWycieczki=" + ocenaWycieczki +
                '}';
    }
}
