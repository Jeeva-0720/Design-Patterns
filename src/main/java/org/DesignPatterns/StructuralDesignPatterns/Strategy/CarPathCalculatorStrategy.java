package org.DesignPatterns.StructuralDesignPatterns.Strategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String target) {
        System.out.println("Car Path");
    }
}
