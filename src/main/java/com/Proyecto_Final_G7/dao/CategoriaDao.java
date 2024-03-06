package com.Proyecto_Final_G7.dao;



import com.Proyecto_Final_G7.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao 
        extends JpaRepository <Categoria, Long>{
    
}
