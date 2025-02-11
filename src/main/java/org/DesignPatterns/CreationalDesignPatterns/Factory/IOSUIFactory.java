package org.DesignPatterns.CreationalDesignPatterns.Factory;

import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Button.Button;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Button.IOSButton;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Dropdown.Dropdown;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Dropdown.IOSDropdown;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Menu.IOSMenu;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Menu.Menu;

public class IOSUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

}
