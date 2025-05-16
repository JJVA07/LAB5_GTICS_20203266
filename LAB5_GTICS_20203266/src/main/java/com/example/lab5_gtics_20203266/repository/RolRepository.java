package com.example.lab5_gtics_20203266.repository;

import com.example.lab5_gtics_20203266.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    Rol findByNombre(String nombre);
}
