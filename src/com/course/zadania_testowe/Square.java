package com.course.zadania_testowe;

public class Square extends Figura implements IFigura {

    public int bok;

    public Square(int bok) {
        this.bok = bok;
        Figura.getListaFigur().add(this);
    }

    public int getBok() {
        return bok;
    }

    public void setBok(int bok) {
        this.bok = bok;
    }

    @Override
    public String toString() {
        return "Square{" +
                "bok=" + bok +
                '}';
    }

    @Override
    public double obliczPole() {
        return bok * bok;
    }

    @Override
    public double obliczObwod() {
        return 4*bok;
    }
}
