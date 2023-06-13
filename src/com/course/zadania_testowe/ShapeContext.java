package com.course.zadania_testowe;

public class ShapeContext {
    private IShapeStrategy strategy;

    public void setStrategy(IShapeStrategy strategy) {
        this.strategy = strategy;
    }

    public IFigura procesShape(String[] params){

        return strategy.create(params);
    }

    public IShapeStrategy getStrategy() {
        return strategy;
    }

    @Override
    public String toString() {
        return "ShapeContext{" +
                "strategy=" + strategy +
                '}';
    }
}
