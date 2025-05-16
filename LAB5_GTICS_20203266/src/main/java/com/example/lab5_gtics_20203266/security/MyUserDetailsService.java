package com.example.lab5_gtics_20203266.security;

import com.example.lab5_gtics_20203266.entity.Usuario;
import com.example.lab5_gtics_20203266.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario user = usuarioRepo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("No encontrado"));
        return new MyUserDetails(user);
    }
}
