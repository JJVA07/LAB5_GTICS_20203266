package com.example.lab5_gtics_20203266.controller;

import com.example.lab5_gtics_20203266.security.MyUserDetails;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/usuarios")
    public String listaUsuarios(Authentication auth, Model model) {
        MyUserDetails user = (MyUserDetails) auth.getPrincipal();
        model.addAttribute("nombre", user.getUsuario().getNombre());
        model.addAttribute("rol", user.getAuthorities().iterator().next().getAuthority().replace("ROLE_", ""));
        return "admin/usuarios";
    }
}
