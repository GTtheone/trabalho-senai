package com.senai.infob.vava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.vava.models.Usuario;
import com.senai.infob.vava.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public Usuario cadastrar(@RequestBody Usuario usuario, @RequestParam String confSenha) {
        return usuarioService.cadastrar(usuario, confSenha);
    }
 
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(email, senha);
    }

    @GetMapping("/buscar/{id}")
   public Usuario buscar(@PathVariable Integer id){
    return usuarioService.buscar(id);
   }
   
   @PutMapping("atualizar/{id}")
   public Usuario atualizar(@PathVariable Integer id, @RequestBody Usuario Usuario) {
        return usuarioService.atualizar(id, Usuario);
   }
}