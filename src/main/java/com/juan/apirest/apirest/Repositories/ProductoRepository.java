package com.juan.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
