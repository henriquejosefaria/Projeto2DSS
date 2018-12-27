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
    private Integer configId; //strings com os nomes dos componentes do pacote
    
    public Pacote(String nome, Integer configId){
        this.nome = nome;
        this.configId = configId;
    }

    public String getNome() {
        return nome;
    }

    public Integer getConfigId() {
        return configId;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
