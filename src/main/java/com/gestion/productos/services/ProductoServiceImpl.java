package com.gestion.productos.services;

import com.gestion.productos.dao.ProductoDao;
import com.gestion.productos.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;
    @Override
    public Producto save(Producto producto) {
        return this.productoDao.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return this.productoDao.findById(id).orElse(null);
    }

    @Override
    public List<Producto> findAll() {
        return this.productoDao.findAll();
    }

    @Override
    public void delete(Long id) {
        this.productoDao.deleteById(id);

    }
}
