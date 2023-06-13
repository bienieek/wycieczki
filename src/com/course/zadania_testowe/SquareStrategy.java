package com.course.zadania_testowe;

public class SquareStrategy implements IShapeStrategy{
    @Override
    public Square create(String[] params) {
        return new Square(Integer.parseInt(params[1]));
    }

}
