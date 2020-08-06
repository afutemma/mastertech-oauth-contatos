package com.mastertech.contatos.model;

import javax.persistence.*;

@Entity
@Table
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int idUsuario;
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
