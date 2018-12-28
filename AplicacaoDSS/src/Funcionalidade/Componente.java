package Funcionalidade;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author André
 */
public class Componente {
    
    private String nome;
    private Integer stock;
    private String tipo; 
    private double preco;
    private String descricao;

    public Componente(String nome, Integer stock, String tipo, double preco, String descricao) {
        this.nome = nome;
        this.stock = stock;
        this.tipo = tipo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getStock() {
        return stock;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setStock(Integer stock){
        this.stock = stock;
    }
}
