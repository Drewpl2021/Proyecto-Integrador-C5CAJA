package com.example.appcaja.service;


import com.example.appcaja.entity.RegistroVentas;

import java.util.List;
import java.util.Optional;

public interface RegistroVentasService {
    public List<RegistroVentas> listar();

    public RegistroVentas guardar(RegistroVentas registroVentas );

    public RegistroVentas actualizar(RegistroVentas registroVentas );

    public Optional<RegistroVentas> listarPorId(Double id);

    public void eliminarPorId(Double id);
}
