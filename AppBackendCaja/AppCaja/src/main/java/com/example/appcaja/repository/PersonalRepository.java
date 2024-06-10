package com.example.appcaja.repository;

import com.example.appcaja.entity.Personal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalRepository extends JpaRepository<Personal, Double> {
}
