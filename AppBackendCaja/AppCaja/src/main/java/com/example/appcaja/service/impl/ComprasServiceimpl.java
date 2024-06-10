package com.example.appcaja.service.impl;

import com.example.appcaja.entity.Compras;
import com.example.appcaja.repository.ComprasRepository;
import com.example.appcaja.service.ComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComprasServiceimpl implements ComprasService {
    @Autowired
    private ComprasRepository comprasRepository;

    @Override
    public List<Compras> listar(){

        return comprasRepository.findAll();
    }

    @Override
    public Compras guardar(Compras compras) {

        return comprasRepository.save(compras );
    }

    @Override
    public Compras actualizar(Compras compras) {

        return comprasRepository.save(compras);
    }

    @Override
    public Optional<Compras> listarPorId(Double id){

        return comprasRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Double id) {

        comprasRepository.deleteById(id);
    }
}
