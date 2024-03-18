package main.Creational.Factory.AbstractFactory.Models;

import main.Creational.Factory.AbstractFactory.Button;
import main.Creational.Factory.AbstractFactory.CheckBox;
import main.Creational.Factory.AbstractFactory.Interfaces.FormFactory;

public class DarkForm implements FormFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new DarkCheckBox();
    }
}
