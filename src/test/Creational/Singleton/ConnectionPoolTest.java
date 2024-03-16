package test.Creational.Singleton;
import main.Creational.Singleton.ConnectionPool;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class ConnectionPoolTest {
    @Test
    public void getInstanceTest(){
        ConnectionPool instance1 = ConnectionPool.getInstance();
        ConnectionPool instance2 = ConnectionPool.getInstance();
        assertNotNull("Instance is created",instance1);
        assertSame("instance are same ",instance1,instance2);
        assertTrue("instance are equal",instance1==instance2);
    }

}
