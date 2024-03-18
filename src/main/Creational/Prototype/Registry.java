package main.Creational.Prototype;
import java.util.HashMap;

public class Registry<ENTITY,ENTITY_TYPE> {
    HashMap<ENTITY_TYPE,ENTITY> objectStore = new HashMap<>();

    public void registerObject(ENTITY object , ENTITY_TYPE type){
        objectStore.put(type,object);
    }
    public ENTITY getObject(ENTITY_TYPE type){
        return objectStore.get(type);
    }
}

// I have generic Registry to store any type of object.
