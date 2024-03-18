package main.Structural.Adapter;

import main.Structural.Adapter.External.RazorPay;
import main.Structural.Adapter.External.RazorPayStatus;
import main.Structural.Adapter.Interface.PaymentProvider;

import java.util.Random;

public class RazorPayProvider implements PaymentProvider {
    RazorPay rp = new RazorPay();
    @Override
    public Integer pay(PaymentRequest pq) {
        rp.payAmount(pq.getName(),pq.getAmount());
        return new Random().nextInt();
    }

    @Override
    public PaymentStatus checkPayment(Integer pay_id) {
        RazorPayStatus status = rp.checkStatus(pay_id);
        return this.toStatus(status);
    }

    private PaymentStatus toStatus(RazorPayStatus status) {
        if(status == RazorPayStatus.OK)
            return PaymentStatus.PAYMENT_SUCCESS;
        return PaymentStatus.PAYMENT_FAILURE;
    }
}
