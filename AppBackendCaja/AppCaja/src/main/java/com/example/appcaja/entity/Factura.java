package com.example.appcaja.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date fecha_hora;
    private Double cantidad;
    private Double precioUnitario;
    private Double igv;
    private Double total;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clientes clientes;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public Factura() {
    }

}
