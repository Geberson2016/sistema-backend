package com.projetoweb.sistema_backend.services;

import com.projetoweb.sistema_backend.dto.OrderDTO;
import com.projetoweb.sistema_backend.entities.Order;
import com.projetoweb.sistema_backend.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<OrderDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(OrderDTO::new)
                .toList();
    }

    public OrderDTO findById(Long id) {
        Order order = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        return new OrderDTO(order);
    }
}
