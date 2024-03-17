package main.Creational.Prototype;

import lombok.Getter;

import java.util.HashMap;
import java.util.Stack;

public class Registry<ENTITY,ENTITY_TYPE> {
    HashMap<ENTITY_TYPE,ENTITY> objectStore = new HashMap<>();

    public void registerObject(ENTITY object , ENTITY_TYPE type){
        objectStore.put(type,object);
    }
    public ENTITY getObject(ENTITY_TYPE type){
        return objectStore.get(type);
    }
}

// I have generic Registery to store any type of object.
