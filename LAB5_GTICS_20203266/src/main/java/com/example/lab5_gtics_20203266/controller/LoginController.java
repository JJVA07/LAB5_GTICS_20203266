package com.example.lab5_gtics_20203266.controller;

import com.example.lab5_gtics_20203266.security.MyUserDetails;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/redirect")
    public String redirect(Authentication auth) {
        MyUserDetails user = (MyUserDetails) auth.getPrincipal();
        String role = user.getAuthorities().iterator().next().getAuthority();

        if ("ROLE_ADMIN".equals(role)) {
            return "redirect:/admin/usuarios";
        } else {
            return "redirect:/user/juego";
        }
    }
}
