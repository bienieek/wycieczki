package com.course.zadania_testowe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Figura implements IFigura {
    public static List<Figura> listaFigur = new ArrayList<>();

    public static List<Figura> getListaFigur() {
        return listaFigur;
    }



    public static int countS(String s){
        return listaFigur.stream()
                .filter(e -> s.equals(e.getClass().getSimpleName()))
                .toList()
                .size();
    }

    public static String wrtiePolesAndCircuit() {
        listaFigur.stream()
                .forEach(e -> {
                    System.out.println();
                    System.out.println(e.obliczObwod());
                });
         return "S";
    }

    @Override
    public double obliczPole() {
        return 0;
    }

    @Override
    public double obliczObwod() {
        return 0;
    }
}
