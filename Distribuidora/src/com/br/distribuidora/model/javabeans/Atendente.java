package com.br.distribuidora.model.javabeans;

import java.io.Serializable;

/**
 *
 * @author thomazpicelli
 */
public class Atendente extends Pessoa implements Serializable{

    public Atendente(int pk, String nome) {
        super(pk, nome);
    }
    
    
}
