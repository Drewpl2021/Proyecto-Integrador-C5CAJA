package com.example.appcaja.service.impl;

import com.example.appcaja.entity.Clientes;
import com.example.appcaja.repository.ClientesRepository;
import com.example.appcaja.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClientesServiceimpl implements ClientesService {
    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public List<Clientes> listar(){

        return clientesRepository.findAll();
    }

    @Override
    public Clientes guardar(Clientes clientes) {

        return clientesRepository.save(clientes);
    }

    @Override
    public Clientes actualizar(Clientes clientes) {

        return clientesRepository.save(clientes);
    }

    @Override
    public Optional<Clientes> listarPorId(Double id){

        return clientesRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Double id) {

        clientesRepository.deleteById(id);
    }
}
