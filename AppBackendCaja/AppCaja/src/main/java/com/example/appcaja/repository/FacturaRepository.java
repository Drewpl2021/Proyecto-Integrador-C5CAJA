package com.example.appcaja.repository;

import com.example.appcaja.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Double> {
}
