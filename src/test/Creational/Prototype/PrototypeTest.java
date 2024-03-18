package test.Creational.Prototype;

import main.Creational.Prototype.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeTest {
    //Step 3 - testing the clone object
    @Test
    public void testCloneBackGroundObject(){
        BackgroundObject prototype = new BackgroundObject(0,0,20,30, BackgroundObjectType.BUILDING);
        BackgroundObject cloneObject = prototype.cloneObject();

        assertNotNull("If Cloned object should not be NULL" ,cloneObject);
        assertEquals("If Clonned object should be same as Prototype", prototype.getX(),cloneObject.getX());
        cloneObject.setX(20);
        cloneObject.setY(30);
        assertNotEquals("After changing position of clonned object now they shoould not be equal",prototype.getY(),cloneObject.getY());
    }
    @Test
    public void testCloneUserObject(){
        User prototype = new User("Salman","29/02/1990", UserType.Mentor);
        User cloneObject = prototype.cloneObject();
        assertNotNull("If Cloned object should not be NULL" ,cloneObject);
        assertEquals("If Clonned object should be same as Prototype", prototype.getName(),cloneObject.getName());
        cloneObject.setName("Aishwarya");
        assertNotEquals("After changing position of clonned object now they shoould not be equal",prototype.getName(),cloneObject.getName());
    }
    @Test
    public void cloneWithRegistry(){
        Registry<BackgroundObject,BackgroundObjectType> registry = new Registry<>();
        BackgroundObject prototype = new BackgroundObject(0,0,10,20,BackgroundObjectType.TREE);
        registry.registerObject(prototype,prototype.getType());
        BackgroundObject cloneObject = registry.getObject(BackgroundObjectType.TREE).cloneObject();
        assertNotNull("If Cloned object should not be NULL" ,cloneObject);
        assertEquals("If Cloned object should be same as Prototype", prototype.getX(),cloneObject.getX());
        assertEquals("If Cloned object should be same as Prototype", prototype.getType(),cloneObject.getType());
        cloneObject.setX(20);
        cloneObject.setY(30);
        assertNotEquals("After changing position of clonned object now they shoould not be equal",prototype.getY(),cloneObject.getY());


        Registry<User,UserType> registryUser = new Registry<>();
        User proto = new User("Salman","29/02/1990", UserType.Mentor);
        registryUser.registerObject(proto,proto.getType());
        User clone = registryUser.getObject(UserType.Mentor).cloneObject();
        assertNotNull("If Cloned object should not be NULL" ,clone);
        assertEquals("If Cloned object should be same as Prototype", proto.getName(),clone.getName());
        clone.setName("Aishwarya");
        assertNotEquals("After changing position of clonned object now they shoould not be equal",proto.getName(),clone.getName());
    }
}
