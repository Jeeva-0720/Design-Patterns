package org.DesignPatterns.CreationalDesignPatterns.Factory;

public class Flutter {
    public void refreshUI() {
        System.out.println("Refresh the screen");
    }

    public void setTheme() {
        System.out.println("Set theme to the background");
    }

    public UIFactory createUIFactory(SupportedPlatforms platform) {
        return UIFactoryFactory.getUIFactory(platform);
    }
}
