package com.example.appcaja.repository;

import com.example.appcaja.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Double> {
}
