package main.Behavioral.Strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Map {
    NavigationStrategy navigationStrategy;
    public void navigateRoad(String source, String destination){
        navigationStrategy.navigate(source,destination);
    }
}
