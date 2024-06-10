package com.example.appcaja.controller;

import com.example.appcaja.entity.Compras;
import com.example.appcaja.service.ComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class ComprasController {
    @Autowired
    private ComprasService comprasService;

    @GetMapping()
    public ResponseEntity<List<Compras>> list(){

        return ResponseEntity.ok().body(comprasService.listar());
    }

    @PostMapping()
    public ResponseEntity<Compras> save(@RequestBody Compras compras){
        return ResponseEntity.ok(comprasService.guardar(compras ));
    }

    @PutMapping()
    public ResponseEntity<Compras> update(@RequestBody Compras compras){
        return ResponseEntity.ok(comprasService.actualizar(compras ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compras> listById(@PathVariable(required = true) Double id){
        return ResponseEntity.ok().body(comprasService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Double id){ comprasService.eliminarPorId(id);
        return "Eliminado Correctamente :3";
    }
}
