package com.example.paymentmodule.repository;

import com.example.paymentmodule.model.PayProcess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRepo extends JpaRepository<PayProcess,Long> {
}
