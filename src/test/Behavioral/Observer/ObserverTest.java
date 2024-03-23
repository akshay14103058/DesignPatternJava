package test.Behavioral.Observer;

import main.Behavioral.Observer.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverTest {
    BitCoinTracker bitCoinTracker;

    @Before
    public void setUp(){
        bitCoinTracker = new BitCoinTracker();
        bitCoinTracker.subscribe(new EmailService());
        bitCoinTracker.subscribe(new TwitterService());
    }

    @Test
    public void testEmail(){
        bitCoinTracker.setPrice(123.0);
        BitCoin bitCoin = bitCoinTracker.getBitcoin();
        assertEquals(123.0,bitCoin.getPrice(),0.0);
    }

    @Test
    public void testTwitter(){
        bitCoinTracker.setPrice(128.0);
    }
}
