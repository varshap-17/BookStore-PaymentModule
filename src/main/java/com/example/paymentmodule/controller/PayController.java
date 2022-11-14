package com.example.paymentmodule.controller;

import com.example.paymentmodule.dto.PayDto;
import com.example.paymentmodule.model.PayProcess;
import com.example.paymentmodule.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Pay")
public class PayController {
    @Autowired
    PayService payService;
    @PostMapping("/doPayment")
    public PayProcess doPayment(@RequestBody PayDto payProcess){
        return payService.doPay(payProcess);
    }
    @GetMapping("/getId/{payId}")
    public PayProcess getById(@PathVariable long payId){
        return payService.findById(payId);
    }
}
