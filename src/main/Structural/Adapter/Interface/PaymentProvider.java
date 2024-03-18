package main.Structural.Adapter.Interface;

import main.Structural.Adapter.PaymentRequest;
import main.Structural.Adapter.PaymentStatus;

public interface PaymentProvider {
    Integer pay(PaymentRequest pq);
    PaymentStatus checkPayment(Integer pay_id);
}
