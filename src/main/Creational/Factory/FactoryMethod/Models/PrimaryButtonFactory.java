package main.Creational.Factory.FactoryMethod.Models;


import main.Creational.Factory.FactoryMethod.Interfaces.Button;
import main.Creational.Factory.FactoryMethod.Interfaces.ButtonFactory;
import main.Creational.Factory.FactoryMethod.Models.PrimaryButton;

public class PrimaryButtonFactory implements ButtonFactory {

    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
