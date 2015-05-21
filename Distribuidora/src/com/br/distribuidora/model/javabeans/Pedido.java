package com.br.distribuidora.model.javabeans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author thomazpicelli
 */
public class Pedido implements Serializable{
    private int pk;
    private int codigo;
    private ArrayList<Produto> item;
    private double valor;
    private Estado estado;
    public enum Estado{
            MANUTENÇÃO, EXIBICAO, ESPERA
    }
    
}
