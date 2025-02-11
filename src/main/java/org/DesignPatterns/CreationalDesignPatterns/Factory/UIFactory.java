package org.DesignPatterns.CreationalDesignPatterns.Factory;

import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Button.Button;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Dropdown.Dropdown;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Menu.Menu;

public interface UIFactory {

    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
