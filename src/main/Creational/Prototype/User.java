package main.Creational.Prototype;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.PrimitiveIterator;

@Getter
@Setter
@AllArgsConstructor
public class User implements CloneableInterface<User> {
    private String name;
    private String DOB;
    private UserType type;
    @Override
    public User cloneObject() {
        return new User(name,DOB,type);
    }
}
