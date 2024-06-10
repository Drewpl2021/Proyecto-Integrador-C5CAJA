package com.example.appcaja.controller;

import com.example.appcaja.entity.Proveedor;
import com.example.appcaja.service.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/proveedor")
public class ProveedoresController {
    @Autowired
    private ProveedoresService proveedoresService;

    @GetMapping()
    public ResponseEntity<List<Proveedor>> list(){

        return ResponseEntity.ok().body(proveedoresService.listar());
    }

    @PostMapping()
    public ResponseEntity<Proveedor> save(@RequestBody Proveedor  proveedor){
        return ResponseEntity.ok(proveedoresService.guardar(proveedor ));
    }

    @PutMapping()
    public ResponseEntity<Proveedor> update(@RequestBody Proveedor proveedor){
        return ResponseEntity.ok(proveedoresService.actualizar(proveedor ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> listById(@PathVariable(required = true) Double id){
        return ResponseEntity.ok().body(proveedoresService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Double id){ proveedoresService.eliminarPorId(id);
        return "Eliminado Correctamente :3";
    }
}
