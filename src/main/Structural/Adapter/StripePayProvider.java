package main.Structural.Adapter;

import main.Structural.Adapter.External.StripePay;
import main.Structural.Adapter.External.StripePayStatus;
import main.Structural.Adapter.Interface.PaymentProvider;

import java.util.Random;

public class StripePayProvider implements PaymentProvider {
    StripePay sp = new StripePay();
    @Override
    public Integer pay(PaymentRequest pq) {
        sp.createPay(pq.getAccountNumber(),pq.getAmount());
        return new Random().nextInt();
    }
    @Override
    public PaymentStatus checkPayment(Integer pay_id) {
        StripePayStatus status = sp.paymentStatus(pay_id);
        return this.toStatus(status);
    }

    private PaymentStatus toStatus(StripePayStatus status) {
        if(status == StripePayStatus.SUCCESS)
            return PaymentStatus.PAYMENT_SUCCESS;
        return PaymentStatus.PAYMENT_FAILURE;
    }
}
