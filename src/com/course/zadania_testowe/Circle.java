package com.course.zadania_testowe;

public class Circle extends Figura implements IFigura{

    public int promien;

    public Circle(int promien) {
        this.promien = promien;
        Figura.getListaFigur().add(this);
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPole() {
        return 0;
    }

    @Override
    public double obliczObwod() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "promien=" + promien +
                '}';
    }
}
