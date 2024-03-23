package main.Behavioral.Observer;

public class TwitterService implements Consumer{
    @Override
    public void notifyObserver() {
        System.out.println("Twitting Bitcoin Prices");
    }
}
