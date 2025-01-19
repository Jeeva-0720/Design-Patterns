package org.DesignPatterns.StructuralDesignPatterns.Strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String target) {
        System.out.println("Walking Path");
    }
}
