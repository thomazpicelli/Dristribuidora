package com.br.distribuidora.model.javabeans;

import java.io.Serializable;

/**
 *
 * @author thomazpicelli
 */
public class Cliente extends Pessoa implements Serializable {
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public Cliente(int pk, String nome, String cpf, String telefone, String email, String endereco) {
        super(pk, nome);
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
}
