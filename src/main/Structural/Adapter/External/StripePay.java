package main.Structural.Adapter.External;

public class StripePay {
    public void createPay(Long acctNo , Integer amt){
        System.out.println("Stripe API called for payment");
    }
    public StripePayStatus paymentStatus(Integer paymentID){
        return StripePayStatus.SUCCESS;
    }
}
