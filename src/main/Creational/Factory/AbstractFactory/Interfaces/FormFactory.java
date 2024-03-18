package main.Creational.Factory.AbstractFactory.Interfaces;

import main.Creational.Factory.AbstractFactory.Button;
import main.Creational.Factory.AbstractFactory.CheckBox;

public interface FormFactory {
    Button createButton();
    CheckBox createCheckbox();
}
