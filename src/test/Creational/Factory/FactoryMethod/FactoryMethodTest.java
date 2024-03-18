package test.Creational.Factory.FactoryMethod;

import main.Creational.Factory.FactoryMethod.Interfaces.Button;
import main.Creational.Factory.FactoryMethod.Interfaces.ButtonFactory;
import main.Creational.Factory.FactoryMethod.Models.PrimaryButton;
import main.Creational.Factory.FactoryMethod.Models.PrimaryButtonFactory;
import main.Creational.Factory.FactoryMethod.Models.RoundButton;
import main.Creational.Factory.FactoryMethod.Models.RoundButtonFactory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryMethodTest {

    ButtonFactory buttonFactory;

    @Before
    public void setUp(){
        buttonFactory = new PrimaryButtonFactory();
    }
    @Test
    public void testFactoryMethod(){
        Button button = buttonFactory.createButton();
        assertNotNull("Object should not be null",button);
        assertTrue("It should be of object Primary Button", button instanceof PrimaryButton);
    }
}
