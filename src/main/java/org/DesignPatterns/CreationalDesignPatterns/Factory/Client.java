package org.DesignPatterns.CreationalDesignPatterns.Factory;

import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Button.Button;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Dropdown.Dropdown;
import org.DesignPatterns.CreationalDesignPatterns.Factory.components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.IOS);

        Button button = uiFactory.createButton();
        button.click();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();

        Dropdown dropdown = uiFactory.createDropdown();
        dropdown.showDropdown();
    }
}
