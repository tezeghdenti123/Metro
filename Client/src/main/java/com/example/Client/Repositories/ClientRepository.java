package com.example.Client.Repositories;

import com.example.Client.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    public boolean existsByEmail(String email);
}
