package org.DesignPatterns.StructuralDesignPatterns.Strategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String target) {
        System.out.println("Bike Path");
    }
}
