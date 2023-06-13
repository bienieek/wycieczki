package com.course.zadania_testowe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

/*
Zadanie 03:
Dany jest plik figury.txt który wygląda mniej wiecej tak:
KWADRAT;10
KWADRAT;20
PROSTOKAT;10;30
KOLO;10
KOLO;20
PROSTOKAT;40;50
KWADRAT;60
nalezy wczytac figury z tego pliku oraz stworzyc z nich liste/tablice figur w programie.
nastepnie nalezy przeiterowac po tej liscie/tablicy i wypisac:
- ile jest kwadratow
- dla kazdej figury wypisac jej pole oraz obwod.
- obslugiwane typy figur: KWADRAT,KOLO,PROSTOKAT - dla innych ma byc rzucony wyjatek podczas tworzenia
- wykorzystaj wzorzec projektowy strategii do wykonania zadania
tj: nie uzywaj ifow if(pierwsztWyraz.equals("KWADRAT")) itp, tylko zrob to ladnie 😉
 */

        Files.lines(Paths.get("figury.txt")).forEach(figura -> {
            System.out.println(figura);

            String[] parmas =  figura.split(";");
            ShapeContext shapeContext = new ShapeContext();

            shapeContext.setStrategy(new ShapeStrategyFactory().createStrategy(parmas[0]));
            shapeContext.procesShape(parmas);
        });
        System.out.println(Figura.getListaFigur());

        System.out.println(Figura.countS("Square"));
        Figura.wrtiePolesAndCircuit();




//        System.out.println(shapeContext.getStrategy().create(new String[]{"Kwadrat", "20"}));

        //fabryka i strategia wzorce projektowe

    }

}