/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto_Final_G7.service.Impl;

import com.Proyecto_Final_G7.dao.ProductoDao;
import com.Proyecto_Final_G7.domain.Producto;
import com.Proyecto_Final_G7.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {
    
    //Se crea un objeto tipo Autowired que se crearà automàticamente y solo una vez
    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional
    public List<Producto> getProductos(boolean activo) {
         var lista = productoDao.findAll();
        if (activo) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
         productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
         productoDao.delete(producto);
    }

    @Override
    public List<Producto> consultaJPA(double precioInf, double precioSup) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> consultaJPQL(double precioInf, double precioSup) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> consultaSQL(double precioInf, double precioSup) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
