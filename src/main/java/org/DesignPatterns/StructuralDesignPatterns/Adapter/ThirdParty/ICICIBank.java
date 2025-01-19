package org.DesignPatterns.StructuralDesignPatterns.Adapter.ThirdParty;

public class ICICIBank {

    public void transfer(int from, int to, int amount) {
        System.out.println("Money transferred via ICICIBank");
    }
}
