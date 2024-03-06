package com.Proyecto_Final_G7.dao;


import com.Proyecto_Final_G7.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao 
        extends JpaRepository <Producto, Long>{
    
}
