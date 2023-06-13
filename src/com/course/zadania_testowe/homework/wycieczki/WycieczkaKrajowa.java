package com.course.zadania_testowe.homework.wycieczki;

public class WycieczkaKrajowa extends Wycieczka{
    private String miasto;

    public WycieczkaKrajowa(int id, int cena, String motywWycieczki, double ocenaWycieczki, String miasto) {
        super(id, cena, motywWycieczki, ocenaWycieczki);
        this.miasto = miasto;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "WycieczkaKrajowa{" +
                "miasto='" + miasto + '\'' +
                '}';
    }
}
