package com.example.paymentmodule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderData {
    private long orderId;
    private long userid;
    private long bookId;
    private int price;
    private int quantity;
    private String address;
    private LocalDate date=LocalDate.now();
    private boolean cancel;
}
