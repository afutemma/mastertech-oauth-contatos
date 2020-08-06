package com.mastertech.contatos.service;

import com.mastertech.contatos.model.Contato;
import com.mastertech.contatos.model.Usuario;
import com.mastertech.contatos.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public Contato postContato(Usuario usuario, Contato contato){
        contato.setIdUsuario(usuario.getId());
        return repository.save(contato);
    }

    public List<Contato> getContatos(int idUsuario){
        return repository.findAllByIdUsuario(idUsuario);
    }
}
