package com.example.appcaja.repository;

import com.example.appcaja.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Double> {
}
