package com.Proyecto_Final_G7.dao;

import com.Proyecto_Final_G7.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao
        extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

}
