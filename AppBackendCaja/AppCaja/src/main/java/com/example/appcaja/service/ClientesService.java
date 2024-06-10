package com.example.appcaja.service;

import com.example.appcaja.entity.Clientes;

import java.util.List;
import java.util.Optional;

public interface ClientesService {
    public List<Clientes> listar();

    public Clientes guardar(Clientes clientes);

    public Clientes actualizar(Clientes clientes);

    public Optional<Clientes> listarPorId(Double id);

    public void eliminarPorId(Double id);
}
