package com.Api.Rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Empresa")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    Long id;
    @Column(name = "Nombre")
    String nombre;
    @Column(name = "Rubro")
    String rubro;

}
