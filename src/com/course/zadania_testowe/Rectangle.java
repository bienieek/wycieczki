package com.course.zadania_testowe;

public class Rectangle extends Figura implements IFigura{
    public int a;
    public int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        Figura.getListaFigur().add(this);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }

    @Override
    public double obliczObwod() {
        return (a*2) + (b*2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
