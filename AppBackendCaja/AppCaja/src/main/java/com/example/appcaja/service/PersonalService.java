package com.example.appcaja.service;


import com.example.appcaja.entity.Personal;

import java.util.List;
import java.util.Optional;

public interface PersonalService {
    public List<Personal> listar();

    public Personal guardar(Personal personal);

    public Personal actualizar(Personal personal);

    public Optional<Personal> listarPorId(Double id);

    public void eliminarPorId(Double id);
}
