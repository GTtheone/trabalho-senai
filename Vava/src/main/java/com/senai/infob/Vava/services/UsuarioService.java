package com.senai.infob.vava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


import com.senai.infob.vava.models.Usuario;
import com.senai.infob.vava.repositories.UsuarioRepository;


@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;


    @PostMapping("/cadastrar")
    public Usuario cadastrar(Usuario usuario, String confSenha){
        if(usuario.getSenha().equals(confSenha)){
            return usuarioRepository.save(usuario);
        }
        return null;
    }
    public String login(String email, String senha ) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if(usuario != null && senha.equals(usuario.getSenha())) {
            return "Login efetuado com sucesso";
        }
        return "Falha ao realizar login";
    }

}