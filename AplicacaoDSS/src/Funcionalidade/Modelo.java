package Funcionalidade;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryzon
 */
public class Modelo {
    private String nome;
    private double preco;

    public Modelo(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double p){
        this.preco = preco;
        
    }
    
 
}
