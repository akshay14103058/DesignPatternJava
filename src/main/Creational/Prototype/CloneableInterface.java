package main.Creational.Prototype;

// I have made a generic cloneableInterface so any class can implements this interface
// Step 1 Making a clonable Interface that will help us in cloning a object and whichever class implements this there we can clone the object.
public interface CloneableInterface<ENTITY>{
    public ENTITY cloneObject();
}








//*******Prototype Pattern

// Step 2 - Create a class which implement the cloneable.
// Step 3 - Implement the cloneObject method in clas.
// Step 4 - Test using creating a prototype object and a clone object using clone object method.

//**Prototype Registry

// In addition to above step 3 we will create a Registry of Generic Types with a HashMap.
// We will store Entity Type and Entity in Hashmap.
// We will implement two method registerObject and getObject in Registry for object cloning of a particular entity type.


