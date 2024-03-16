package main.Creational.Builder;

import lombok.Getter;
import lombok.Setter;
import javax.xml.crypto.Data;

@Getter
public class Database {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long id;
    private DatabaseType type;

    //step 1 = Hide outer Constructor
    private Database(){}

    //Static Initializer for Builder class
    public static DatabaseBuilder builder(){
        return new DatabaseBuilder();
    }

    //Step 2- Creating the static class
    @Setter
    public static class DatabaseBuilder {

        //Step 3 - Copy all properties from outer class
        private String host;
        private Integer port;
        private String username;
        private String password;
        private Long id;
        private DatabaseType type;

        //Step 4 - Build hook for instance creation of outer class
        public Database build(){
            Database instance = new Database();
            instance.host = host;
            instance.port = port;
            instance.type = type;
            return instance;
        }
    }

}

//Why Builder is needed :

//1. Complex Object Creation ( If class have lots of properties )
//2. Validation of properties before creating object.
//3. Immutability - To have your class object Immutable so no one can modify them


// Step 1  - Hide your constructor by making it private
// Step 2 - Create a static class builder in your  class
// Step 3 - Copy all you properties of outer class in inner class.
// Step 4 - Create Build method in your inner class that return an object of your outer class.
// Step 5 - Create a static initializer for Builder class in outer class for easy return.

//There are some additional steps as well.

//We can also add Fluent Interface for more readable code. Implemented in DataStore Class in same Package

// We can also add now valition before creating object itself.
