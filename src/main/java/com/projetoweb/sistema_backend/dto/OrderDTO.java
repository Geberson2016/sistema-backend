package com.projetoweb.sistema_backend.dto;

import com.projetoweb.sistema_backend.entities.Order;
import com.projetoweb.sistema_backend.entities.User;

import java.time.Instant;


    public record OrderDTO(
            Long id,
            Instant moment,
            String status,
            Double total,
            User client
    ) {
        public OrderDTO(Order order) {
            this(
                    order.getId(),
                    order.getMoment(),
                    order.getOrderStatus().name(),
                    order.getTotal(),
                    order.getClient()
            );
        }
}
