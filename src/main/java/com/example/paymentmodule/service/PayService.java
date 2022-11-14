package com.example.paymentmodule.service;

import com.example.paymentmodule.dto.OrderData;
import com.example.paymentmodule.dto.PayDto;
import com.example.paymentmodule.model.PayProcess;
import com.example.paymentmodule.repository.PayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;
import java.util.UUID;

@Service
public class PayService {
    @Autowired
    PayRepo payRepo;
    @Autowired
    RestTemplate restTemplate;
    public PayProcess doPay(PayDto payDto) {
        OrderData orderData = restTemplate.getForObject("http://localhost:8090/OrderData/ById/" + payDto.getOrderId(), OrderData.class);
        System.out.println(orderData);
        payDto.setAmount(orderData.getPrice());
        payDto.setTransId(UUID.randomUUID().toString());
        payDto.setStatus(paymentProcessing());
        String response=payDto.getStatus().equals("success")?"Payment done successful and order placed!":"Payment failed and order could not placed..";
        payDto.setMessage(response);
        PayProcess payProcess = new PayProcess(orderData.getOrderId(),payDto.transId,payDto.getStatus(),payDto.getAmount(),payDto.getMessage());
        payRepo.save(payProcess);
        return payProcess;
    }
    public String paymentProcessing(){
        return new Random().nextBoolean()?"success":"failure";
    }
    public PayProcess findById(long payId){
        return payRepo.findById(payId).orElse(null);
    }
}
