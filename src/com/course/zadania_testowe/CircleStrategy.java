package com.course.zadania_testowe;

public class CircleStrategy implements IShapeStrategy{

    @Override
    public IFigura create(String[] params) {
        return new Circle(Integer.parseInt(params[1]));
    }
}
