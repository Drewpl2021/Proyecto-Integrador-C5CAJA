package com.example.appcaja.service.impl;

import com.example.appcaja.entity.Personal;
import com.example.appcaja.repository.PersonalRepository;
import com.example.appcaja.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalServiceimpl implements PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    @Override
    public List<Personal> listar(){

        return personalRepository.findAll();
    }

    @Override
    public Personal guardar(Personal personal) {

        return personalRepository.save(personal );
    }

    @Override
    public Personal actualizar(Personal personal) {

        return personalRepository.save(personal );
    }

    @Override
    public Optional<Personal> listarPorId(Double id){

        return personalRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Double id) {

        personalRepository.deleteById(id);
    }
}
