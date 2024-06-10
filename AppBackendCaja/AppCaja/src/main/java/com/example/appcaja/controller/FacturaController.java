package com.example.appcaja.controller;

import com.example.appcaja.entity.Factura;
import com.example.appcaja.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    private FacturaService facturaService;

    @GetMapping()
    public ResponseEntity<List<Factura>> list(){

        return ResponseEntity.ok().body(facturaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Factura> save(@RequestBody Factura factura){
        return ResponseEntity.ok(facturaService.guardar(factura ));
    }

    @PutMapping()
    public ResponseEntity<Factura> update(@RequestBody Factura factura){
        return ResponseEntity.ok(facturaService.actualizar(factura));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> listById(@PathVariable(required = true) Double id){
        return ResponseEntity.ok().body(facturaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Double id){ facturaService.eliminarPorId(id);
        return "Eliminado Correctamente :3";
    }
}
