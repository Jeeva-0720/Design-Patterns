package org.DesignPatterns.CreationalDesignPatterns.Factory.components.Dropdown;

public class IOSDropdown implements Dropdown {

    @Override
    public void showDropdown() {
        System.out.println("Show IOS Dropdown");
    }
}
