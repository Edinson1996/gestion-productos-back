package com.gestion.productos.dao;

import com.gestion.productos.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto,Long> {
}
