package main.Creational.Factory.SimpleFactory;



public class PrimaryButton extends Button{

    private Integer height;
    private Integer width;

    PrimaryButton(Integer _height, Integer _width){
        this.height = _height;
        this.width = _width;
    }
    @Override
    void onClick() {
        System.out.println("Primary Button Clicked");
    }
    @Override
    void render() {
        System.out.println("Primary Button rendered");

    }
}
