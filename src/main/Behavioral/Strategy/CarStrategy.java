package main.Behavioral.Strategy;

public class CarStrategy implements NavigationStrategy{
    @Override
    public void navigate(String src, String dest) {
        System.out.println("Navigating from "+src+" to "+dest+" via Car");
    }
}
