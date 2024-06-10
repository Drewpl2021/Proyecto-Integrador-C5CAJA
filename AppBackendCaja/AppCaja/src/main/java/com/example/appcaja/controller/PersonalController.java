package com.example.appcaja.controller;

import com.example.appcaja.entity.Personal;
import com.example.appcaja.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/personal")
public class PersonalController {
    @Autowired
    private PersonalService personalService;

    @GetMapping()
    public ResponseEntity<List<Personal>> list(){

        return ResponseEntity.ok().body(personalService.listar());
    }

    @PostMapping()
    public ResponseEntity<Personal> save(@RequestBody Personal personal){
        return ResponseEntity.ok(personalService.guardar(personal ));
    }

    @PutMapping()
    public ResponseEntity<Personal> update(@RequestBody Personal personal){
        return ResponseEntity.ok(personalService.actualizar(personal ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personal> listById(@PathVariable(required = true) Double id){
        return ResponseEntity.ok().body(personalService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Double id){ personalService.eliminarPorId(id);
        return "Eliminado Correctamente :3";
    }
}
