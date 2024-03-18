package test.Creational.Factory.SimpleFactory;

import main.Creational.Factory.SimpleFactory.Button;
import main.Creational.Factory.SimpleFactory.ButtonFactory;
import main.Creational.Factory.SimpleFactory.PlatformTypes;
import main.Creational.Factory.SimpleFactory.PrimaryButton;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleFactoryTest {

    @Test
    public void testSimpleFactory(){

        Button button = ButtonFactory.createButton(PlatformTypes.WINDOWS);

        assertNotNull("If object is created it should not be null " ,button);
        assertTrue("Button should be of return type Primary for windows", button instanceof PrimaryButton);

    }
}
