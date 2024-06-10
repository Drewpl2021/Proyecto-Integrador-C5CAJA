package com.example.appcaja.service;


import com.example.appcaja.entity.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ProveedoresService {
    public List<Proveedor> listar();

    public Proveedor guardar(Proveedor proveedor);

    public Proveedor actualizar(Proveedor proveedor);

    public Optional<Proveedor> listarPorId(Double id);

    public void eliminarPorId(Double id);
}
