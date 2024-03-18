package main.Creational.Factory.AbstractFactory.Models;

import main.Creational.Factory.AbstractFactory.Button;
import main.Creational.Factory.AbstractFactory.CheckBox;
import main.Creational.Factory.AbstractFactory.Interfaces.FormFactory;

public class LightForm implements FormFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }
    @Override
    public CheckBox createCheckbox() {
        return new LightCheckBox();
    }
}
