package com.example.appcaja.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "registro_ventas")
public class RegistroVentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date fecha_hora;
    @ManyToOne
    @JoinColumn(name = "id_factura")
    private Factura factura;

    public RegistroVentas() {
    }
}
