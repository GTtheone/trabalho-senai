package com.senai.infob.vava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.vava.models.Endereco;
import com.senai.infob.vava.services.EnderecoService;



@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    public EnderecoService enderecoService;
    
    
    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }


   @GetMapping("/buscar/{id}")
   public Endereco buscar(@PathVariable Integer id){
    return enderecoService.buscar(id);
   }
   
}
