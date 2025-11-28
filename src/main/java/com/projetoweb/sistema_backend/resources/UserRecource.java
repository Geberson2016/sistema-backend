package com.projetoweb.sistema_backend.resources;

import com.projetoweb.sistema_backend.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserRecource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "maria", "ghdh@gg.com", "3343", "9skdsk");
        return ResponseEntity.ok().body(u);
    }
}
