package com.Api.Rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Productos")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    Long id;
    @Column(name = "Nombre")
    String nombre;
    @Column(name = "Descripcion")
    String descripcion;
    @Column(name = "Precio")
    double precio;
    @Column(name = "Cantidad_de_Stock")
    int cantidadDeStock;


}
