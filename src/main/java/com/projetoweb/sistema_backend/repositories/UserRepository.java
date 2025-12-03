package com.projetoweb.sistema_backend.repositories;

import com.projetoweb.sistema_backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
