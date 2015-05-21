package com.br.distribuidora.model.javabeans;

import java.io.Serializable;

/**
 *
 * @author thomazpicelli
 */
public abstract class Pessoa implements Serializable{
    private int pk;
    private String nome;

    public Pessoa(int pk, String nome) {
        this.pk = pk;
        this.nome = nome;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}