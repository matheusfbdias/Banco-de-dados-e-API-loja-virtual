package com.kyoto.loja_spring_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyoto.loja_spring_app.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

