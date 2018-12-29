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
    private String img;

    public Modelo(String nome, double preco, String Img){
        this.nome = nome;
        this.preco = preco;
        this.img = Img;
    }
    
    
    public String getNome() {
        return nome;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public String getImg(){
        return this.img;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double p){
        this.preco = preco;
        
    }
    
    public void setImg(String img){
        this.img = img;
    }
    
 
}
