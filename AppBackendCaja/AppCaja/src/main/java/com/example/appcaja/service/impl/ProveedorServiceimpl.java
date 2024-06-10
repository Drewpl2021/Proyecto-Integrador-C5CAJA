package com.example.appcaja.service.impl;

import com.example.appcaja.entity.Proveedor;
import com.example.appcaja.repository.ProveedoresRepository;
import com.example.appcaja.service.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServiceimpl implements ProveedoresService {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @Override
    public List<Proveedor> listar(){

        return proveedoresRepository.findAll();
    }

    @Override
    public Proveedor guardar(Proveedor proveedor) {

        return proveedoresRepository.save(proveedor );
    }

    @Override
    public Proveedor actualizar(Proveedor proveedor) {

        return proveedoresRepository.save(proveedor );
    }

    @Override
    public Optional<Proveedor> listarPorId(Double id){

        return proveedoresRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Double id) {

        proveedoresRepository.deleteById(id);
    }
}
