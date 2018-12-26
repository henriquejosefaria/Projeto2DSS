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
public class Pacote {
    
    private String nome;
    private ArrayList<String> componentes; //strings com os nomes dos componentes do pacote
    
    public Pacote(String nome, ArrayList<String> componentes){
        nome = "";
        componentes = new ArrayList<String>();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setComponentes(ArrayList<String> componentes){
        this.componentes = componentes;
    }
    
}
