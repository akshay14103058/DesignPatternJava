package main.Behavioral.Observer;


import java.util.ArrayList;
import java.util.List;

//Step-1 Create a Producer Interface ( or Better an abstract class producer)
public abstract class Producer {
    List<Consumer> consumers = new ArrayList<Consumer>();
    public void notifyChange(){
        for(Consumer c : consumers){
            c.notifyObserver();
        }
    }
    public void subscribe(Consumer consumer){
        consumers.add(consumer);
    }
    public void unsubscribe(Consumer consumer){
        consumers.remove(consumer);
    }
}
