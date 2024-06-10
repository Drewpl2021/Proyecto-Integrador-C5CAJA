package com.example.appcaja.controller;

import com.example.appcaja.entity.RegistroVentas;
import com.example.appcaja.service.RegistroVentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/registroventas")
public class RegistroVentasController {
    @Autowired
    private RegistroVentasService registroVentasService;

    @GetMapping()
    public ResponseEntity<List<RegistroVentas>> list(){

        return ResponseEntity.ok().body(registroVentasService.listar());
    }

    @PostMapping()
    public ResponseEntity<RegistroVentas> save(@RequestBody RegistroVentas registroVentas ){
        return ResponseEntity.ok(registroVentasService.guardar(registroVentas ));
    }

    @PutMapping()
    public ResponseEntity<RegistroVentas> update(@RequestBody RegistroVentas registroVentas ){
        return ResponseEntity.ok(registroVentasService.actualizar(registroVentas ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistroVentas> listById(@PathVariable(required = true) Double id){
        return ResponseEntity.ok().body(registroVentasService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Double id){ registroVentasService.eliminarPorId(id);
        return "Eliminado Correctamente :3";
    }
}
