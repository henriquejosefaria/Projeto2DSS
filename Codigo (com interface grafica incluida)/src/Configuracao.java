/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author André
 */
public class Configuracao {
    
    private String nome;
    private ArrayList<String> componentes; //strings com os nomes dos componentes escolhidos
    
    public Configuracao(String nome, ArrayList<String> componentes){
        this.nome = nome;
        this.componentes = componentes;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setComponentes(ArrayList<String> componentes){
        this.componentes = componentes;
    }
}
