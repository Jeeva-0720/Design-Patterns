package org.DesignPatterns.StructuralDesignPatterns.Strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorMode(String mode) {
        if (mode.equals("Car")) {
            return new CarPathCalculatorStrategy();
        }
        else if (mode.equals("Bike")) {
            return new BikePathCalculatorStrategy();
        } else {
            return new WalkPathCalculatorStrategy();
        }
    }
}
