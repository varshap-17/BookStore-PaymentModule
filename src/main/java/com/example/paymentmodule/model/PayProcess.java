package com.example.paymentmodule.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long payId;
    private String transId;
    private String status;
    private long orderId;
    private int amount;
    private String message;

    public PayProcess(long orderId, String transId, String status, int amount,String message) {
        this.orderId=orderId;
        this.transId=transId;
        this.status=status;
        this.amount=amount;
        this.message=message;
    }
}
