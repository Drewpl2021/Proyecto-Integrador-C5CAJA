package com.example.appcaja.service;


import com.example.appcaja.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public List<Producto> listar();

    public Producto guardar(Producto producto);

    public Producto actualizar(Producto producto);

    public Optional<Producto> listarPorId(Double id);

    public void eliminarPorId(Double id);
}
