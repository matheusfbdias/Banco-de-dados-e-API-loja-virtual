package com.kyoto.loja_spring_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyoto.loja_spring_app.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

