package test.Creational.Builder;

import main.Creational.Builder.Database;
import main.Creational.Builder.Database.DatabaseBuilder;
import main.Creational.Builder.DatabaseType;
import main.Creational.Builder.Datastore;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;


public class DatabaseTest {
    @Test
    public void builderTest(){
        DatabaseBuilder databaseBuilder = Database.builder();
        databaseBuilder.setHost("localhost");
        databaseBuilder.setPort(2048);
        databaseBuilder.setType(DatabaseType.MONGO);
        Database database = databaseBuilder.build();

        assertEquals("If host is set correctly","localhost",database.getHost());
        assertEquals("If host is set correctly",DatabaseType.MONGO,database.getType());

    }

    @Test
    public void builderTestWithFluentInterfaces() {
        Datastore datastore = Datastore
                .builder()
                .mysql()
                .withHost("localhost")
                .onPort(2048)
                .build();

        assertEquals("If host is set correctly","localhost",datastore.getHost());
        assertEquals("If host is set correctly",DatabaseType.MY_SQL,datastore.getType());
        //assertEquals("If port is set correctly", 2048, datastore.getPort());
    }

    //Exception testing
    @Test(expected = RuntimeException.class)
    public void builderWithPortGreaterThanExpected(){
        Datastore datastore = Datastore
                .builder()
                .mysql()
                .withHost("localhost")
                .onPort(22000)
                .build();
    }


}
