package com.example.appcaja.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "compras")
public class Compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double stock;
    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;


    public Compras() {
    }
}
