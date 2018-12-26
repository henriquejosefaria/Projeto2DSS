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
    
    private String nomeCliente;
    private Integer id;
    private String modelo;
    private String data;
    private ArrayList<Integer> componentes;
    
    public Configuracao(String nome, ArrayList<Integer> componentes, String modelo, String data){
        this.nomeCliente = nome;
        this.componentes = componentes;
        this.modelo = modelo;
        this.data = data;
    }
    
    public void setNome(String nome){
        this.nomeCliente = nome;
    }
    
    public void setComponentes(ArrayList<Integer> componentes){
        this.componentes = componentes;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
}