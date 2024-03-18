package main.Structural.Adapter;

import lombok.Getter;

@Getter
public class PaymentRequest {
    private String name;
    private String emailId;
    private Long accountNumber;
    private Integer amount;
}
