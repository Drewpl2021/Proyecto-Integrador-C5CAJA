package com.example.appcaja.service;

import com.example.appcaja.entity.Compras;

import java.util.List;
import java.util.Optional;

public interface ComprasService {
    public List<Compras> listar();

    public Compras guardar(Compras compras);

    public Compras actualizar(Compras compras);

    public Optional<Compras> listarPorId(Double id);

    public void eliminarPorId(Double id);
}
