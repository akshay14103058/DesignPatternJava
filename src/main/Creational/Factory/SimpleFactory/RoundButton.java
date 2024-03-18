package main.Creational.Factory.SimpleFactory;


public class RoundButton extends Button{

    private Double radius;
    RoundButton(Double _radius){
        this.radius = _radius;
    }
    @Override
    void onClick() {
        System.out.println("Round button clicked");
    }
    @Override
    void render() {
        System.out.println("Round button rendered");
    }
}
