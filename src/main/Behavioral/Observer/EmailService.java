package main.Behavioral.Observer;

public class EmailService implements Consumer {
    @Override
    public void notifyObserver() {
        System.out.println("Send Email");
    }
}
