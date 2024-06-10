package com.example.appcaja.service.impl;

import com.example.appcaja.entity.Factura;
import com.example.appcaja.repository.FacturaRepository;
import com.example.appcaja.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceimpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Factura> listar(){

        return facturaRepository.findAll();
    }

    @Override
    public Factura guardar(Factura factura) {

        return facturaRepository.save(factura );
    }

    @Override
    public Factura actualizar(Factura factura) {

        return facturaRepository.save(factura );
    }

    @Override
    public Optional<Factura> listarPorId(Double id){

        return facturaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Double id) {

        facturaRepository.deleteById(id);
    }
}
