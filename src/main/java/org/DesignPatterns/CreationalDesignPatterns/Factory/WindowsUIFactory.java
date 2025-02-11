package org.DesignPatterns.CreationalDesignPatterns.Factory;

import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Button.Button;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Button.WindowsButton;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Dropdown.Dropdown;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Dropdown.WindowsDropdown;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Menu.Menu;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
}
