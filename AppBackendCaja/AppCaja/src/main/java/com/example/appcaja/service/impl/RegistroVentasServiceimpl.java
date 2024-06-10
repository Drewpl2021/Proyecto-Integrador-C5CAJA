package com.example.appcaja.service.impl;

import com.example.appcaja.entity.RegistroVentas;
import com.example.appcaja.repository.RegistroVentasRepository;
import com.example.appcaja.service.RegistroVentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroVentasServiceimpl implements RegistroVentasService {

    @Autowired
    private RegistroVentasRepository registroVentasRepository;

    @Override
    public List<RegistroVentas> listar(){

        return registroVentasRepository.findAll();
    }

    @Override
    public RegistroVentas guardar(RegistroVentas registroVentas) {

        return registroVentasRepository.save(registroVentas );
    }

    @Override
    public RegistroVentas actualizar(RegistroVentas registroVentas) {

        return registroVentasRepository.save(registroVentas);
    }

    @Override
    public Optional<RegistroVentas> listarPorId(Double id){

        return registroVentasRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Double id) {

        registroVentasRepository.deleteById(id);
    }
}
