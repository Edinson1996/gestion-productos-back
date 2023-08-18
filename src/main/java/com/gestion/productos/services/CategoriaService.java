package com.gestion.productos.services;

import com.gestion.productos.models.Categoria;


import java.util.List;

public interface CategoriaService {
    public Categoria save(Categoria categoria);
    public Categoria findById(Long id);
    public List<Categoria> findAll();
    public void delete(Long id);
}
