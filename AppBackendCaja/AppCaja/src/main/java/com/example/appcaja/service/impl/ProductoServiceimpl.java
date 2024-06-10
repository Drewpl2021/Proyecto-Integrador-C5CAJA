package com.example.appcaja.service.impl;

import com.example.appcaja.entity.Producto;
import com.example.appcaja.repository.ProductoRepository;
import com.example.appcaja.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceimpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listar(){

        return productoRepository.findAll();
    }

    @Override
    public Producto guardar(Producto producto) {

        return productoRepository.save(producto );
    }

    @Override
    public Producto actualizar(Producto producto) {

        return productoRepository.save(producto );
    }

    @Override
    public Optional<Producto> listarPorId(Double id){

        return productoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Double id) {

        productoRepository.deleteById(id);
    }
}
