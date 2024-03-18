package main.Creational.Prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;




//Step 2 - Creating a Class which implements cloneObject method from Implement.
@Getter
@Setter
@AllArgsConstructor
public class BackgroundObject implements CloneableInterface<BackgroundObject> {
    private Integer x;
    private Integer y;
    private Integer height;
    private Integer width;
    private BackgroundObjectType type;

    @Override
    public BackgroundObject cloneObject(){
        return new BackgroundObject(x,y,height,width,type);
    }
}