package com.course.zadania_testowe.homework;

public abstract class Osoba {
        private String imie;
        private String nazwisko;
        private String mail;
        private int numerTelefonu;

        public Osoba(String imie, String nazwisko, String mail, int numerTelefonu) {
                this.imie = imie;
                this.nazwisko = nazwisko;
                this.mail = mail;
                this.numerTelefonu = numerTelefonu;
        }
}
