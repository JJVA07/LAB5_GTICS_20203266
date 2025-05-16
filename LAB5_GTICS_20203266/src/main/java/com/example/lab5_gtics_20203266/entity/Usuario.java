package com.example.lab5_gtics_20203266.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L; // obligatorio para Serializable

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;

    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private Integer edad;
    private String pwd;
    private Boolean activo;

    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol rol;
}
