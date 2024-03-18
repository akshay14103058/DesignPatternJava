package test.Creational.Factory.AbstractFactory;

import main.Creational.Factory.AbstractFactory.Button;
import main.Creational.Factory.AbstractFactory.CheckBox;
import main.Creational.Factory.AbstractFactory.Interfaces.FormFactory;
import main.Creational.Factory.AbstractFactory.Models.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class AbstractFactoryTest {
    FormFactory formFactory ;
    @Before
    public void setUp(){
        formFactory = new DarkForm();
    }

    @Test
    public void testAbstractFactory(){
        Button button = formFactory.createButton();
        CheckBox checkBox = formFactory.createCheckbox();
        assertNotNull("Button should not be null", button);
        assertNotNull("CheckBox should not be null", checkBox);
        assertTrue("Button should light Button", button instanceof DarkButton);
        assertTrue("Button should light Button", checkBox instanceof DarkCheckBox);
    }
}
