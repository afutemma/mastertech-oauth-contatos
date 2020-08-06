package com.mastertech.contatos.repository;

import com.mastertech.contatos.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

    List<Contato> findAllByIdUsuario(int idUsuario);
}
