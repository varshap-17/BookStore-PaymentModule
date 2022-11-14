package com.example.paymentmodule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayDto {
    public String transId;
    public long orderId;
    private String status;
    private int amount;
    private String message;
}
