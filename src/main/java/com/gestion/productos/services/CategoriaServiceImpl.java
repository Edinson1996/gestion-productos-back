package com.gestion.productos.services;

import com.gestion.productos.dao.CategoriaDao;
import com.gestion.productos.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    public Categoria save(Categoria categoria) {
        return this.categoriaDao.save(categoria);
    }

    @Override
    public Categoria findById(Long id) {
        return this.categoriaDao.findById(id).orElse(null);
    }

    @Override
    public List<Categoria> findAll() {
        return this.categoriaDao.findAll();
    }

    @Override
    public void delete(Long id) {

        this.categoriaDao.deleteById(id);

    }
}
