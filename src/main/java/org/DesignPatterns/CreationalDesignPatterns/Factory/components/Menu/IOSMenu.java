package org.DesignPatterns.CreationalDesignPatterns.Factory.components.Menu;

public class IOSMenu implements Menu {
    @Override
    public void showMenu() {
        System.out.println("IOS Menu");
    }
}
