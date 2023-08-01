package com.TheVault.Service.impl;

import com.TheVault.Dao.UsuarioDao;
import com.TheVault.Domain.Rol;
import com.TheVault.Domain.Usuario;
import com.TheVault.Service.UsuarioDetailsService;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userDetailsService")
public class UsuarioDetailsServiceImpl implements UsuarioDetailsService, UserDetailsService {
    
    @Autowired
    private UsuarioDao usuarioDao;
    @Autowired
    private HttpSession session;
    
    @Override
    @Transactionl(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findByUsername(username);
        
        if(usuario== null){
            throw new UsernameNotFoundExption(msg:username);
    }
    
    session.removeAtribute(string:"usuarioImagen");
    session.setAttribute(string:"usuarioImagen", o:Usuario.getRutaImagen());
    
    var roles = ArrayList<GrantedAuthority>();
    for (Rol rol : usuario.getRoles()){
        roles.add(new SimpleGrantedAuthority(role:rol.getNombre()));
    }
    
    return new User(username:usuario.getUsername(), password:usuario.getPassword(), authorities:roles);
    }
}
