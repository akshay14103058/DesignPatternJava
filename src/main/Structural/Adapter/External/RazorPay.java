package main.Structural.Adapter.External;

public class RazorPay {

    public void payAmount(String name, Integer amt){
        System.out.println("Razor Pay API called for payment");
    }
    public RazorPayStatus checkStatus(Integer paymentId){
        return RazorPayStatus.OK;
    }

}
