package main.Behavioral.Strategy;

public class BikeStrategy implements NavigationStrategy{

    @Override
    public void navigate(String src, String dest) {
        System.out.println("Navigating from "+src+" to "+dest+" via Bike");
    }
}
