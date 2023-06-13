package com.course.zadania_testowe.homework.wycieczki;

public class WycieczkaZagraniczna extends Wycieczka{
    private String kraj;
    private String rodzajTransportu;

    public WycieczkaZagraniczna(int id, int cena, String motywWycieczki, double ocenaWycieczki, String kraj, String rodzajTransportu) {
        super(id, cena, motywWycieczki, ocenaWycieczki);
        this.kraj = kraj;
        this.rodzajTransportu = rodzajTransportu;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getRodzajTransportu() {
        return rodzajTransportu;
    }

    public void setRodzajTransportu(String rodzajTransportu) {
        this.rodzajTransportu = rodzajTransportu;
    }
}
