package com.mastertech.contatos.controller;

import com.mastertech.contatos.model.Contato;
import com.mastertech.contatos.model.Usuario;
import com.mastertech.contatos.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContatoController {

    @Autowired
    ContatoService service;

    @PostMapping("/contato")
    public Contato postContato(@RequestBody Contato contato, @AuthenticationPrincipal Usuario usuario){
        return service.postContato(usuario, contato);
    }

    @GetMapping("/contatos")
    public List<Contato> getContatos(@AuthenticationPrincipal Usuario usuario){
        System.out.println(usuario.getNome());
        return service.getContatos(usuario.getId());
    }

}
