package com.course.zadania_testowe;

import java.awt.*;

public class RectangleStrategy implements  IShapeStrategy{

    @Override
    public IFigura create(String[] params) {
        return new Rectangle(Integer.parseInt(params[1]),Integer.parseInt(params[2]));
    }
}
