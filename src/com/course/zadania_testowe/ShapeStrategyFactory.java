package com.course.zadania_testowe;

import java.awt.*;

class ShapeStrategyFactory {


    public IShapeStrategy createStrategy(String shapeType) {
        switch (shapeType) {
            case "KOLO":
                return new CircleStrategy();
            case "KWADRAT":
                return new SquareStrategy();
            case "PROSTOKAT":
                return new RectangleStrategy();
            default:
                throw new IllegalArgumentException("Nieobsługiwany typ figury: " + shapeType);
        }


    }
}
