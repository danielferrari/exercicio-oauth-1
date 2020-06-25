package br.com.mastertech.usuario;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @GetMapping
    public Usuario getUsuario(@AuthenticationPrincipal Usuario usuario) {
        return usuario;
    }
}
