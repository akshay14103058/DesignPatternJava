package main.Creational.Singleton;

public class ConnectionPool {

    //Lazy Load
    //private static ConnectionPool instance;

    //Eagerly Loaded
    //private static ConnectionPool instance = new ConnectionPool();

    //Lazy Load with Double check
    private static ConnectionPool instance;
    private ConnectionPool(){}

    //Lazy Load
//    public static ConnectionPool getInstance(){
//        if(instance == null){
//            instance = new ConnectionPool();
//        }
//        return instance;
//    }

    //Eagerly Loaded
//    public static ConnectionPool getInstance(){
//        return instance;
//    }

    //Lazy Load with Double check for Synchronization
    public static ConnectionPool getInstance(){
        if(instance == null){
            synchronized (ConnectionPool.class){
                if(instance == null) instance = new ConnectionPool();
            }
        }
        return instance;
    }
}
