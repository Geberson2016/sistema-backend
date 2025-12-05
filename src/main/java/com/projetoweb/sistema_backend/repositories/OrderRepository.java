package com.projetoweb.sistema_backend.repositories;

import com.projetoweb.sistema_backend.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
