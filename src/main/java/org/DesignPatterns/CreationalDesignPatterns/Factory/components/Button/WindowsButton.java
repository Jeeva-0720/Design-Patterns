package org.DesignPatterns.CreationalDesignPatterns.Factory.components.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button clicking");
    }

    @Override
    public void changeSize() {
        System.out.println("Windows button changing size");
    }
}
