package org.DesignPatterns.StructuralDesignPatterns.Strategy;

public class GoogleMap {
    public void findPath(String source, String destination, String mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorMode(mode);
        pathCalculatorStrategy.findPath(source, destination);
    }
}
