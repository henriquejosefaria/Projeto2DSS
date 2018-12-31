package Funcionalidade;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author André
 */
public class Pacote {
    
    private String nome;
    private Integer configId; 
    private String image;
    
    public Pacote(String nome, Integer configId,String image){
        this.nome = nome;
        this.configId = configId;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public String getNome() {
        return nome;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public Integer getConfigId() {
        return configId;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
