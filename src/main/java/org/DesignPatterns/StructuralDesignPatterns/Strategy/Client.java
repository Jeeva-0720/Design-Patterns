package org.DesignPatterns.StructuralDesignPatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();

        googleMap.findPath("Chennai", "Delhi", "Car");
    }
}
