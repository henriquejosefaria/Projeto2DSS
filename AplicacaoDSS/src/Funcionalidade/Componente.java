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
public class Componente implements Comparable<Componente>{
    
    private String nome;
    private Integer stock;
    private String tipo; 
    private double preco;
    private String descricao;
    private String image;

    public Componente(String nome, Integer stock, String tipo, double preco, String descricao,String image) {
        this.nome = nome;
        this.stock = stock;
        this.tipo = tipo;
        this.preco = preco;
        this.descricao = descricao;
        this.image = image;
    }

    public String getImage() {
        return image;
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
    
    public int compareTo(Componente b){
        if(this.getPreco() > b.getPreco()) return -1;
        else return 1;
    }
}
