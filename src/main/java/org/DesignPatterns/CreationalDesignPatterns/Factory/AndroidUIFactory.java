package org.DesignPatterns.CreationalDesignPatterns.Factory;

import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Button.AndroidButton;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Button.Button;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Dropdown.AndroidDropdown;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Dropdown.Dropdown;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Menu.AndroidMenu;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
