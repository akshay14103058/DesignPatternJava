package main.Creational.Factory.SimpleFactory;

public class ButtonFactory {
    public static Button createButton(PlatformTypes platForm){
        switch(platForm){
            case IOS :
                return new RoundButton(2.5);
            case WINDOWS:
                return new PrimaryButton(3,4);
            case MOBILE:
                return new RoundButton(1.5);
        }
        throw new RuntimeException("Invalid Platform Types");
    }
}
