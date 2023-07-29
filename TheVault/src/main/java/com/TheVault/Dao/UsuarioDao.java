package com.TheVault.Dao;

import com.TheVault.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    
    Usuario findByUsername(String username);
    
    Usuario findbyUsernameAndPassword(String username, String Password);
    
    boolean existsByUsernameOrCorreo(String username, String correo);
    
}
