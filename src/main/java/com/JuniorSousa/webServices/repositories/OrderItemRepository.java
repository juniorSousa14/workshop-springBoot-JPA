package com.JuniorSousa.webServices.repositories;

import com.JuniorSousa.webServices.entities.OrderItem;
import com.JuniorSousa.webServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
