package test.Structural.Adapter;

import main.Structural.Adapter.Interface.PaymentProvider;
import main.Structural.Adapter.PaymentRequest;
import main.Structural.Adapter.PaymentStatus;
import main.Structural.Adapter.RazorPayProvider;
import main.Structural.Adapter.StripePayProvider;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentProviderTest {
    PaymentProvider pp;
    @Before
    public void setUp(){
        pp = new RazorPayProvider();
    }
    @Test
    public void testAdapter(){
        PaymentStatus status = pp.checkPayment(pp.pay(new PaymentRequest()));
        assertEquals("Status should be success",PaymentStatus.PAYMENT_SUCCESS,status);
    }
}
