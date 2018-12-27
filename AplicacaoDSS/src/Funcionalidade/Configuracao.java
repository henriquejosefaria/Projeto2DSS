package funcionalidade;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author André
 */
public class Configuracao {
    
    private Integer nContribuinte;
    private String nome;
    private Integer id;
    private String modelo;
    private String data;
    private List<Componente> componentes = new ArrayList<>();
    
    public Configuracao(Integer id,String nome,Integer n, ArrayList<Componente> componentes, String modelo, String data){
        this.id = id;
        this.nome = nome;
        this.nContribuinte = n;
        this.componentes = new ArrayList<>();
        this.modelo = modelo;
        this.data = data;
    }

    public Integer getNContribuinte() {
        return nContribuinte;
    }

    public Integer getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getData() {
        return data;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }
    
    public void setNContribuinte(Integer n){
        this.nContribuinte = n;
    }
    
    public void addComponente(Componente componente){
        componentes.add(componente);
    }
    
    public void removeComponente(Componente componente){
        componentes.remove(componente);
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
}