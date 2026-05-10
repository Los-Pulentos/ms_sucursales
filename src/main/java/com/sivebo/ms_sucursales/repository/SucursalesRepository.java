package com.sivebo.ms_sucursales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sivebo.ms_sucursales.model.Sucursales;

public interface SucursalesRepository extends JpaRepository<Sucursales, Long> {
        List<Sucursales> findByIdComuna(Long id_comuna);
        Sucursales findByNombre(String nombre);
        
}
