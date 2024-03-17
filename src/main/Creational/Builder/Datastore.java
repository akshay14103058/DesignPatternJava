package main.Creational.Builder;

import lombok.Getter;

@Getter
public class Datastore {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long id;
    private DatabaseType type;

    //Step1
    private Datastore(){};


    //Static Initializer
    public static DatastoreBuilder builder(){
        return new DatastoreBuilder();
    }

    public static  class DatastoreBuilder{
        //Step 2
        //Instead of copying properties of Outer class we can also create a instance of outer class to avoid the
        //Duplicate code part and that will also help in making code more maintainable.
        private String host;
        private Integer port;
        private String username;
        private String password;
        private Long id;
        private DatabaseType type;

        public Datastore build(){
            if(!validateObject()){
                throw new RuntimeException("Object is Invalid");
            }
            Datastore datastore = new Datastore();
            datastore.host = host;
            datastore.port = port;
            datastore.type = type;
            return datastore;
        }

        ///Fluent Interface for setter
        public DatastoreBuilder withHost(String hostName){
            this.host = hostName;
            return this;
        }

        public DatastoreBuilder onPort(Integer portNumber){
            this.port = portNumber;
            return this;
        }

        public DatastoreBuilder mysql(){
            this.type = DatabaseType.MY_SQL;
            return this;
        }

        //Validation Example method
        public boolean validateObject(){
            return this.port <= 20000;
        }
    }

}
